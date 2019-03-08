package org.tools.expr.core.entity.node;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IdentifierNode implements INode {

    private String content;
}
