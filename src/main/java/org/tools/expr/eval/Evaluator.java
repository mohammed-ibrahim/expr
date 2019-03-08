package org.tools.expr.eval;

import java.util.Map;

import org.tools.expr.core.entity.DerivableData;
import org.tools.expr.core.entity.Operator;
import org.tools.expr.core.entity.node.ComparatorNode;
import org.tools.expr.core.entity.node.INode;
import org.tools.expr.core.entity.node.IdentifierNode;
import org.tools.expr.core.entity.node.LiteralNode;
import org.tools.expr.core.entity.node.Root;

import lombok.Data;

@Data
public class Evaluator {

    private Map<String, Object> params;

    public Boolean evaluate(INode root) {

        if (root instanceof Root) {

            return evaluate(((Root) root).getChild());
        }

        if (root instanceof ComparatorNode) {

            ComparatorNode comparatorNode = (ComparatorNode)root;
            return this.compare(comparatorNode.getLhs(), comparatorNode.getOp(), comparatorNode.getRhs());
        }

        return Boolean.FALSE;
    }

    private Boolean compare(INode lhs, Operator op, INode rhs) {


        DerivableData rhsData = resolveNode(rhs);
        DerivableData lhsData = resolveNode(lhs);

        //TODO: fix below had code
        return true;
    }

    private DerivableData resolveNode(INode node) {
        DerivableData data = null;

        if (node instanceof IdentifierNode) {
            IdentifierNode identifierNode = (IdentifierNode) node;
            String variableName = identifierNode.getContent();

            if (!params.containsKey(variableName)) {

                throw new RuntimeException(String.format("The variable %s is not available", variableName));
            }

            data = new DerivableData((String)params.get(variableName));

        } else if (node instanceof LiteralNode) {

            LiteralNode lrNode = (LiteralNode)node;
            data = new DerivableData((String)lrNode.getLiteralValue());

        }

        return data;
    }
}
