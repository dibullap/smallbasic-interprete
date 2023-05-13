// Generated from D:/Diego/Programación/Lenguajes de Programación/Analizador Semántico/interprete/small-basic-interprete/small-basic-interprete/grammar\SmallBasic.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SmallBasicParser}.
 */
public interface SmallBasicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(SmallBasicParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(SmallBasicParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(SmallBasicParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(SmallBasicParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(SmallBasicParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(SmallBasicParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#sinosi}.
	 * @param ctx the parse tree
	 */
	void enterSinosi(SmallBasicParser.SinosiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#sinosi}.
	 * @param ctx the parse tree
	 */
	void exitSinosi(SmallBasicParser.SinosiContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(SmallBasicParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(SmallBasicParser.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(SmallBasicParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(SmallBasicParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(SmallBasicParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(SmallBasicParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(SmallBasicParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(SmallBasicParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(SmallBasicParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(SmallBasicParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(SmallBasicParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(SmallBasicParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(SmallBasicParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(SmallBasicParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#llamado}.
	 * @param ctx the parse tree
	 */
	void enterLlamado(SmallBasicParser.LlamadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#llamado}.
	 * @param ctx the parse tree
	 */
	void exitLlamado(SmallBasicParser.LlamadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#interna}.
	 * @param ctx the parse tree
	 */
	void enterInterna(SmallBasicParser.InternaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#interna}.
	 * @param ctx the parse tree
	 */
	void exitInterna(SmallBasicParser.InternaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(SmallBasicParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(SmallBasicParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#parametros2}.
	 * @param ctx the parse tree
	 */
	void enterParametros2(SmallBasicParser.Parametros2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#parametros2}.
	 * @param ctx the parse tree
	 */
	void exitParametros2(SmallBasicParser.Parametros2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#etiqueta}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta(SmallBasicParser.EtiquetaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#etiqueta}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta(SmallBasicParser.EtiquetaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#goto}.
	 * @param ctx the parse tree
	 */
	void enterGoto(SmallBasicParser.GotoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#goto}.
	 * @param ctx the parse tree
	 */
	void exitGoto(SmallBasicParser.GotoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SmallBasicParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SmallBasicParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(SmallBasicParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(SmallBasicParser.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr3(SmallBasicParser.Expr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr3(SmallBasicParser.Expr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#arit}.
	 * @param ctx the parse tree
	 */
	void enterArit(SmallBasicParser.AritContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#arit}.
	 * @param ctx the parse tree
	 */
	void exitArit(SmallBasicParser.AritContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#arit2}.
	 * @param ctx the parse tree
	 */
	void enterArit2(SmallBasicParser.Arit2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#arit2}.
	 * @param ctx the parse tree
	 */
	void exitArit2(SmallBasicParser.Arit2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#arit3}.
	 * @param ctx the parse tree
	 */
	void enterArit3(SmallBasicParser.Arit3Context ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#arit3}.
	 * @param ctx the parse tree
	 */
	void exitArit3(SmallBasicParser.Arit3Context ctx);
	/**
	 * Enter a parse tree produced by {@link SmallBasicParser#arit4}.
	 * @param ctx the parse tree
	 */
	void enterArit4(SmallBasicParser.Arit4Context ctx);
	/**
	 * Exit a parse tree produced by {@link SmallBasicParser#arit4}.
	 * @param ctx the parse tree
	 */
	void exitArit4(SmallBasicParser.Arit4Context ctx);
}