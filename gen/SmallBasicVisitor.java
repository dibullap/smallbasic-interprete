// Generated from D:/Diego/Programación/Lenguajes de Programación/Analizador Semántico/interprete/small-basic-interprete/small-basic-interprete/grammar\SmallBasic.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SmallBasicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SmallBasicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(SmallBasicParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(SmallBasicParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(SmallBasicParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#sinosi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinosi(SmallBasicParser.SinosiContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino(SmallBasicParser.SinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(SmallBasicParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(SmallBasicParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(SmallBasicParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(SmallBasicParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(SmallBasicParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(SmallBasicParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#llamado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamado(SmallBasicParser.LlamadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#interna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterna(SmallBasicParser.InternaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(SmallBasicParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#parametros2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros2(SmallBasicParser.Parametros2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#etiqueta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiqueta(SmallBasicParser.EtiquetaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#goto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto(SmallBasicParser.GotoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SmallBasicParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(SmallBasicParser.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr3(SmallBasicParser.Expr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#arit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArit(SmallBasicParser.AritContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#arit2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArit2(SmallBasicParser.Arit2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#arit3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArit3(SmallBasicParser.Arit3Context ctx);
	/**
	 * Visit a parse tree produced by {@link SmallBasicParser#arit4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArit4(SmallBasicParser.Arit4Context ctx);
}