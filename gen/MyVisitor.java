import java.util.Iterator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MyVisitor<T> extends SmallBasicBaseVisitor<T> {
    HashMap<String,Object> table = new HashMap<>();
    @Override
    public T visitS(SmallBasicParser.SContext ctx) {
        System.out.println("Soy S");
        return visitChildren(ctx);
    }

    @Override public T visitComandos(SmallBasicParser.ComandosContext ctx) { return visitChildren(ctx); }
    @Override public T visitCondicional(SmallBasicParser.CondicionalContext ctx) { return visitChildren(ctx); }
    @Override public T visitSinosi(SmallBasicParser.SinosiContext ctx) { return visitChildren(ctx); }

    @Override public T visitSino(SmallBasicParser.SinoContext ctx) { return visitChildren(ctx); }

    @Override public T visitPara(SmallBasicParser.ParaContext ctx) { return visitChildren(ctx); }

    @Override public T visitStep(SmallBasicParser.StepContext ctx) { return visitChildren(ctx); }

    @Override public T visitMientras(SmallBasicParser.MientrasContext ctx) { return visitChildren(ctx); }

    @Override public T visitFuncion(SmallBasicParser.FuncionContext ctx) { return visitChildren(ctx); }

    @Override public T visitDeclaracion(SmallBasicParser.DeclaracionContext ctx) {
        System.out.println("Soy declaracion");
        String name = ctx.id().ID().getText();

        if (ctx.id().expr().isEmpty()){
            table.put(name, visitExpr(ctx.expr()));
        } else {
            Map<String, Object> dim = new LinkedHashMap<>();
            Map<String, Object> allDim = new LinkedHashMap<>();
            int nDim = ctx.id().expr().size();
            String nm = visitExpr(ctx.id().expr(nDim - 1)).toString();
            dim.put(nm, visitExpr(ctx.expr()));
            for (int i = nDim - 2; i >= 0; i--){
                nm = visitExpr(ctx.id().expr(i)).toString();
                allDim.put(nm, dim);
                dim = allDim;
            }
            table.put(name, allDim);
        }

        System.out.println(name + " = " + ctx.expr().getText());

        return null;
    }

    @Override public T visitId(SmallBasicParser.IdContext ctx) {
        Object r = table.get(ctx.ID().getText());
        if (r != null){
            if (!ctx.expr().isEmpty()){
                Map<String, Object> m = (Map<String, Object>) r;
                int n = ctx.expr().size();
                for (int i = 0; i < n; i++){
                    String nm = visitExpr(ctx.expr(i)).toString();
                    Object rp = m.get(nm);
                    if (rp != null){
                        if (i == n - 1){
                            return (T) rp;
                        }else {
                            m = (Map<String, Object>) rp;
                        }
                    } else {
                        int line = ctx.ID().getSymbol().getLine();
                        int col = ctx.ID().getSymbol().getCharPositionInLine()+1;

                        System.err.printf("<%d:%d> Error semantico: La clave  \"" + nm + "\" no existe.\n", line, col);
                        System.exit(-1);
                        return null;
                    }
                }
            } else {
                return (T) r;
            }
        } else {
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine()+1;

            System.err.printf("<%d:%d> Error semantico: La variable con nombre \"" + ctx.ID().getText() + "\" no fue declarada.\n", line, col);
            System.exit(-1);
            return null;
        }
        return null;
    }

    @Override public T visitLlamado(SmallBasicParser.LlamadoContext ctx) { return visitChildren(ctx); }

    @Override public T visitInterna(SmallBasicParser.InternaContext ctx) { return visitChildren(ctx); }

    @Override public T visitParametros(SmallBasicParser.ParametrosContext ctx) { return visitChildren(ctx); }

    @Override public T visitParametros2(SmallBasicParser.Parametros2Context ctx) { return visitChildren(ctx); }

    @Override public T visitEtiqueta(SmallBasicParser.EtiquetaContext ctx) { return visitChildren(ctx); }

    @Override public T visitGoto(SmallBasicParser.GotoContext ctx) { return visitChildren(ctx); }

    @Override public T visitExpr(SmallBasicParser.ExprContext ctx) {
        //System.out.println("E1 or: " + ctx.getText());
        if (ctx.expr() != null){
            Boolean c = null;
            Boolean a = Boolean.parseBoolean(visitExpr(ctx.expr()).toString());
            Boolean b = Boolean.parseBoolean(visitExpr2(ctx.expr2()).toString());
            c = a || b;
            System.out.println(c);
            return (T) c;
        } else {
            System.out.println(visitExpr2(ctx.expr2()).toString());
            return visitExpr2(ctx.expr2());
        }
    }

    @Override public T visitExpr2(SmallBasicParser.Expr2Context ctx) {
        //System.out.println("E2 and: " + ctx.getText());
        if (ctx.expr2() != null ){
            Boolean c = null;
            Boolean a = Boolean.parseBoolean(visitExpr2(ctx.expr2()).toString());
            Boolean b = Boolean.parseBoolean(visitExpr3(ctx.expr3()).toString());
            c = a && b;
            return (T) c;
        } else {
            return visitExpr3(ctx.expr3());
        }
    }

    @Override public T visitExpr3(SmallBasicParser.Expr3Context ctx) {
        //System.out.println("1 E3 relops: " + ctx.getText()) ;
        if (ctx.RELOP() != null ){
            Object[] temp = {visitArit(ctx.arit(0)), visitArit(ctx.arit(1))};
            T[] operandos = (T[]) temp;
            Double[] dop = {1.0, 1.0};
            Integer[] iop = {1, 1};
            for (int i = 0; i < 2; i++){
                T p = parseString(operandos[i].toString());
                if (p.toString().contains(".")){
                    dop[i] = Double.parseDouble(p.toString());
                } else {
                    iop[i] = Integer.parseInt(p.toString());
                }
            }
            Boolean ans = null;
            switch (ctx.RELOP().getText()){
                case "<":
                    ans = dop[0] * iop[0] < dop[1] * iop[1];
                    break;
                case "<>":
                    ans = dop[0] * iop[0] != dop[1] * iop[1];
                    break;
                case ">":
                    ans = dop[0] * iop[0] > dop[1] * iop[1];
                    break;
                case     ">=":
                    ans = dop[0] * iop[0] >= dop[1] * iop[1];
                    break;
                case "=":
                    ans = dop[0] * iop[0] == dop[1] * iop[1];
                    break;
                case "<=":
                    ans = dop[0] * iop[0] <= dop[1] * iop[1];
                    break;
            }
            return (T) ans;
        } else {
            return visitArit(ctx.arit(0)); // Revisar indice de arit para esta regla
        }
    }

    @Override public T visitArit(SmallBasicParser.AritContext ctx) {
        //System.out.println("A1 suma: " + ctx.getText());
        if (ctx.arit() != null){
            boolean conc = false;
            Object[] temp = {visitArit(ctx.arit()), visitArit2(ctx.arit2())};
            T[] operandos = (T[]) temp;
            Double[] dop = {0.0, 0.0};
            Integer[] iop = {0, 0};
            for (int i = 0; i < 2; i++){
                T p = parseString(operandos[i].toString());
                if (p.toString().contains(".")){
                    Double d = Double.parseDouble(p.toString());
                    dop[i] = d;
                } else {
                    Integer e = Integer.parseInt(p.toString());
                    iop[i] = e;
                }
            }
            String ans = null;
            switch (ctx.OPSUM().getText()){
                case "+":
                    for (int i = 0; i < 2; i++){
                        try {
                            if (operandos[i].toString().contains(".")){
                                dop[i] = Double.parseDouble(operandos[i].toString());
                            } else {
                                iop[i] = Integer.parseInt(operandos[i].toString());
                            }
                        } catch (Exception ex){
                            conc = true;
                        }
                    }
                    if (conc){
                        ans = (operandos[0].toString() + operandos[1].toString());
                    } else {
                        ans = (dop[0] + iop[0] + dop[1] + iop[1]) + "";
                    }
                    break;
                case "-":
                    ans = ((dop[0] - iop[0]) - (dop[1] - iop[1])) + "";
                    break;
            }
            return (T) ans;
        } else {
            return visitArit2(ctx.arit2());
        }
    }

    @Override public T visitArit2(SmallBasicParser.Arit2Context ctx) {
        //System.out.println("A2 producto: " + ctx.getText());
        if (ctx.arit2() != null){
            Object[] temp = {visitArit2(ctx.arit2()), visitArit3(ctx.arit3())};
            T[] operandos = (T[]) temp;
            Double[] dop = {1.0, 1.0};
            Integer[] iop = {1, 1};
            for (int i = 0; i < 2; i++){
                T p = parseString(operandos[i].toString());
                if (p.toString().contains(".")){
                    Double d = Double.parseDouble(p.toString());
                    dop[i] = d;
                } else {
                    Integer e = Integer.parseInt(p.toString());
                    iop[i] = e;
                }
            }
            Double ans = null;
            switch (ctx.OPMUL().getText()){
                case "*":
                    ans = ((dop[0] * iop[0]) *  (dop[1] * iop[1]));
                    break;
                case "/":
                    if (dop[1] * iop[1] != 0){
                        ans = ((dop[0] * iop[0]) /  (dop[1] * iop[1]));
                    } else {
                        ans = (dop[0] * iop[0]);
                    }

                    break;
            }
            return (T) ans;
        } else {
            return visitArit3(ctx.arit3());
        }
    }

    @Override public T visitArit3(SmallBasicParser.Arit3Context ctx) {
        //System.out.println("A3 negativo: " + ctx.getText());
        if (ctx.TKN_MINUS() != null){
            T p = parseString(visitArit4(ctx.arit4()).toString() );
            if (p.toString().contains(".")){
                Double d = null;
                d = - Double.parseDouble(p.toString());
                return (T) d;
            } else {
                Integer e = null;
                e = - Integer.parseInt(p.toString());
                return (T) e;
            }
        } else {
            return visitArit4(ctx.arit4());
        }
    }

    @Override public T visitArit4(SmallBasicParser.Arit4Context ctx) {
        //System.out.println("A4 Valor: " + ctx.getText());
        if (ctx.NUM() != null){
            String n = ctx.NUM().getText();
            if (n.contains(".")){
                Double d = null;
                d = Double.parseDouble(n);
                return (T) d;
            } else {
                Integer e = null;
                e = Integer.parseInt(n);
                return (T) e;
            }
        } else if (ctx.TEXT() != null){
            return (T) ctx.TEXT().getText().replace("\"", "");
        } else if (ctx.VERDADERO() != null){
            Boolean b = null;
            b = true;
            return (T) b;
        } else if (ctx.FALSO() != null){
            Boolean b = null;
            b = false;
            return (T) b;
        } else if (ctx.id() != null){
            return (T) visitId(ctx.id());
        } else if (ctx.interna() != null){
            return (T) visitInterna(ctx.interna());
        } else if (ctx.expr() != null){
            return (T) visitExpr(ctx.expr());
        } else {
            return null;
        }
    }

    public T parseString(String s){
        Integer inval = null;
        inval = 0;
        if (s.contains(".")){
            try {
                Double d = null;
                d = Double.parseDouble(s);
                return (T) d;
            } catch (Exception ex) {

                return (T) inval;
            }
        } else {
            try {
                Integer e = null;
                e = Integer.parseInt(s);
                return (T) e;
            } catch (Exception ex) {
                return (T) inval;
            }
        }
    }

}
