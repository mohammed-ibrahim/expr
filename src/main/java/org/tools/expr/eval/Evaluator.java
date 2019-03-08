package org.tools.expr.eval;

import java.util.Map;

import org.tools.expr.core.entity.node.ComparatorNode;
import org.tools.expr.core.entity.node.INode;
import org.tools.expr.core.entity.node.Root;

public class Evaluator {

    public Boolean evaluate(INode root, Map<String, Object> params) {

        if (root instanceof Root) {

            return evaluate(((Root) root).getChild(), params);
        }

        if (root instanceof ComparatorNode) {
            ComparatorNode comparatorNode = (ComparatorNode)root;

            switch (comparatorNode.getOp()) {
            case EQ:
                
                break;

            default:
                break;
            }
        }

        return Boolean.FALSE;
    }
}
