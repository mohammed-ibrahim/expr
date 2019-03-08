package org.tools.expr.synthesis;

import org.tools.expr.core.entity.IdentifierNode;
import org.tools.expr.core.entity.Operator;
import org.tools.expr.core.entity.node.ComparatorNode;
import org.tools.expr.core.entity.node.INode;
import org.tools.expr.core.entity.node.Root;
import org.tools.expr.synthesis.grammar.ExpressionBaseVisitor;
import org.tools.expr.synthesis.grammar.ExpressionParser;

public class Analyzer extends ExpressionBaseVisitor<INode> {

    @Override
    public INode visitVisitExpression(ExpressionParser.VisitExpressionContext ctx) {

        System.out.println("visitVisitExpression");
        INode child = visit(ctx.expression());
        return new Root(child);

    }

    @Override
    public INode visitSliteralExpression(ExpressionParser.SliteralExpressionContext ctx) {
        System.out.println("visitSliteralExpression");
        return visitChildren(ctx);
    }

    @Override
    public INode visitBinaryExpression(ExpressionParser.BinaryExpressionContext ctx) {
        System.out.println("visitBinaryExpression");
        return visitChildren(ctx);
    }

    @Override
    public INode visitInExpression(ExpressionParser.InExpressionContext ctx) {
        System.out.println("visitInExpression");
        return visitChildren(ctx);
    }

    @Override
    public INode visitDecimalExpression(ExpressionParser.DecimalExpressionContext ctx) {
        System.out.println("visitDecimalExpression");
        return visitChildren(ctx);
    }

    @Override
    public INode visitBoolExpression(ExpressionParser.BoolExpressionContext ctx) {
        System.out.println("visitBoolExpression");
        return visitChildren(ctx);
    }

    @Override
    public INode visitIdentifierExpression(ExpressionParser.IdentifierExpressionContext ctx) {

        System.out.println("visitIdentifierExpression");
        System.out.println(ctx.IDENTIFIER().getText());
        return new IdentifierNode(ctx.IDENTIFIER().getText());
    }

    @Override
    public INode visitLikeExpression(ExpressionParser.LikeExpressionContext ctx) {
        System.out.println("visitLikeExpression");
        return visitChildren(ctx);
    }

    @Override
    public INode visitNotExpression(ExpressionParser.NotExpressionContext ctx) {
        System.out.println("visitNotExpression");
        return visitChildren(ctx);
    }

    @Override
    public INode visitParenExpression(ExpressionParser.ParenExpressionContext ctx) {
        System.out.println("visitParenExpression");
        return visitChildren(ctx);
    }

    @Override
    public INode visitComparatorExpression(ExpressionParser.ComparatorExpressionContext ctx) {
        System.out.println("visitComparatorExpression");

        INode lhs = visit(ctx.left);
        INode rhs = visit(ctx.right);
        Operator op = Operator.parse(ctx.comparator().getText().toLowerCase());

        ComparatorNode node = new ComparatorNode(op, lhs, rhs);
        return node;
    }

    @Override
    public INode visitSliteralList(ExpressionParser.SliteralListContext ctx) {
        System.out.println("visitSliteralList");
        return visitChildren(ctx);
    }

    @Override
    public INode visitDecimalList(ExpressionParser.DecimalListContext ctx) {
        System.out.println("visitDecimalList");
        return visitChildren(ctx);
    }

    @Override
    public INode visitComparator(ExpressionParser.ComparatorContext ctx) {
        System.out.println("visitComparator");
        return visitChildren(ctx);
    }

    @Override
    public INode visitBinary(ExpressionParser.BinaryContext ctx) {
        System.out.println("visitBinary");
        return visitChildren(ctx);
    }

    @Override
    public INode visitBool(ExpressionParser.BoolContext ctx) {
        System.out.println("visitBool");
        return visitChildren(ctx);
    }
}
