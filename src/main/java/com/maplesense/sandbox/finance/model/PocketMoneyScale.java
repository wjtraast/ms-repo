package com.maplesense.sandbox.finance.model;

import java.util.HashMap;
import java.util.Map;

public class PocketMoneyScale {

    private static Map<Integer, Double> pocketMoneyScale = initializePocketMoneyScale();

    private PocketMoneyScale() {
        throw new IllegalStateException("Utility class");
    }

    private static Map<Integer, Double> initializePocketMoneyScale() {
        Map<Integer, Double> scale = new HashMap<>();
        scale.put(7, 1.0);
        scale.put(8, 1.5);
        scale.put(9, 2.0);
        scale.put(10, 2.5);
        scale.put(11, 3.0);
        scale.put(12, 3.5);
        scale.put(13, 4.0);
        scale.put(14, 4.5);
        scale.put(15, 5.0);
        scale.put(16, 5.5);
        scale.put(17, 6.0);
        scale.put(18, 6.5);
        return scale;
    }

    public static Double getPocketMoneyByAge(Integer age) {
        return pocketMoneyScale.get(age);
    }
}
