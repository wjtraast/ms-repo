package com.maplesense.sandbox.game;

/**
 * Todo: Add class comment here.
 *
 * @author Wietjenk Traast
 * @since 21 Jan 2019
 */
public class DiceRoller {

    private Dice dieOne;
    private Dice dieTwo;

    public int rollBothDice() {
        dieOne = Dice.randomDice();
        dieTwo = Dice.randomDice();

        return dieOne.getEyes() + dieTwo.getEyes();
    }
}
