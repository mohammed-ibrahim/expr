package org.tools.expr.core.entity;

import org.tools.expr.core.entity.node.INode;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IdentifierNode implements INode {

    private String content;
}
