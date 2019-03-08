package org.tools.expr.core.entity.node;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LiteralNode implements INode {

    private String literalValue;
}
