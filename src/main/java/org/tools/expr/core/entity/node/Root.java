package org.tools.expr.core.entity.node;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Root implements INode {

    private INode child;

}
