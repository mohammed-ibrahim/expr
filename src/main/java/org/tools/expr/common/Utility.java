package org.tools.expr.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utility {
    public static <K,V> Map<K, V> mapify(List<Object> items) {

        if (items.size() % 2 != 0) {

            throw new RuntimeException("Length of items should be even number in mapify");
        }

        Map<K, V> map = new HashMap<>();

        int numIterations = items.size() / 2;
        for (int i = 0; i < numIterations ; i++) {

            int keyIndex = i * 2;
            int valueIndex = keyIndex + 1;
            map.put((K)items.get(keyIndex), (V)items.get(valueIndex));
        }

        return map;
    }
}
