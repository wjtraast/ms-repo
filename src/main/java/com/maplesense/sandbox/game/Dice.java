package com.maplesense.sandbox.game;

import java.util.Arrays;
import java.util.Random;

/**
 * Todo: Add class comment here.
 *
 * @author Wietjenk Traast
 * @since 21 Jan 2019
 */
public enum Dice {

    ONE(1, "Een"),
    TWO(2, "Twee"),
    THREE(3, "Drie"),
    FOUR(4, "Vier"),
    FIVE(5, "Vijf"),
    SIX(6, "Zes");

    private int eyes;
    private String value;

    Dice(int eyes, String value) {
        this.eyes = eyes;
        this.value = value;
    }

    public static Dice randomDice() {
        return Arrays.asList(values()).get(new Random().nextInt(values().length));
    }

    public int getEyes() {
        return eyes;
    }

    public String getValue() {
        return value;
    }
}
