package org.tools.expr.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ComparatorNode implements INode {

    private String op;

    private INode lhs;

    private INode rhs;
}
