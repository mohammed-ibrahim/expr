package org.tools.expr.core.entity.node;


import org.tools.expr.core.entity.Operator;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ComparatorNode implements INode {

    private Operator op;

    private INode lhs;

    private INode rhs;
}
