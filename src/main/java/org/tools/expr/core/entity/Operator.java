package org.tools.expr.core.entity;

import java.util.Arrays;
import java.util.Map;

import org.tools.expr.common.Utility;

public enum Operator {

    GT, GE, LT, LE, EQ, NE, IS;

    private static final Map<String, Operator> operatorMap = Utility.<String, Operator>mapify(
                Arrays.asList(
                    ">",  GT,
                    ">=", GE,
                    "<",  LT,
                    "<=", LE,
                    "=",  EQ,
                    "!=", NE,
                    "is", IS
                )
            );

    public static Operator parse(String input) {

        if (operatorMap.containsKey(input)) {

            return operatorMap.get(input);
        }

        throw new RuntimeException(String.format("Uknown operator: %s", input));
    }
}
