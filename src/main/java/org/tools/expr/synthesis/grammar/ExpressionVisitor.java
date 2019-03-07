// Generated from ./src/main/resources/Expression.g4 by ANTLR 4.5.1
package org.tools.expr.synthesis.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code visitExpression}
	 * labeled alternative in {@link ExpressionParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitExpression(ExpressionParser.VisitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sliteralExpression}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliteralExpression(ExpressionParser.SliteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(ExpressionParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpression(ExpressionParser.InExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalExpression(ExpressionParser.DecimalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(ExpressionParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(ExpressionParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code likeExpression}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeExpression(ExpressionParser.LikeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(ExpressionParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(ExpressionParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparatorExpression(ExpressionParser.ComparatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sliteralList}
	 * labeled alternative in {@link ExpressionParser#obj_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliteralList(ExpressionParser.SliteralListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalList}
	 * labeled alternative in {@link ExpressionParser#obj_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalList(ExpressionParser.DecimalListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(ExpressionParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(ExpressionParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ExpressionParser.BoolContext ctx);
}