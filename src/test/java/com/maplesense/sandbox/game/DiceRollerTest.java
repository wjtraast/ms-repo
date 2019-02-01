package com.maplesense.sandbox.game;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Todo: Add class comment here.
 *
 * @author Wietjenk Traast
 * @since 26 Jan 2019
 */
public class DiceRollerTest {

    private DiceRoller subject;

    @Before
    public void setUp() throws Exception {
        subject = new DiceRoller();
    }

    @Test
    public void testRollBothDice() {

        int result = subject.rollBothDice();

        System.out.println(result);
        assertNotNull(result);
        assertNotEquals(result, 0);

        assertTrue(result < 13);
        assertTrue(result > 1);
    }

    @Test
    public void testManyTimes() {
        for (int i = 0; i < 20; i++) {
            testRollBothDice();
        }
    }

}