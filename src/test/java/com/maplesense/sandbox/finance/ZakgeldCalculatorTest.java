package com.maplesense.sandbox.finance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

class ZakgeldCalculatorTest {

    ZakgeldCalculator subject;

    @BeforeEach
    void setUp() {
        subject = new ZakgeldCalculator();
    }

    @Test
    void testShareTheWelth() {
        subject.shareTheWelth();
    }

    @Test
    void testGiveNextSaturday() {
        LocalDate nextSaturday = subject.giveNextSaturday();
        System.out.println("Next saturday: " + nextSaturday.format(DateTimeFormatter.ofPattern("EEEE dd MMM yyyy")));
    }

    @Test
    void testGiveAllNextSaturdays() {
        List<LocalDate> nextSaturdays = subject.giveAllNextSaturdaysPerYear(2019);
        for (LocalDate saturday : nextSaturdays)
        System.out.println("Next saturday: " + saturday.format(DateTimeFormatter.ofPattern("EEEE dd MMM yyyy")));
    }

    @Test
    void testGetAllSaturdays() {
        List<LocalDate> allSats = subject.giveAllPreviousSaturdaysPerYear(2019);

        for (LocalDate saturday : allSats){
            System.out.println(saturday.format(DateTimeFormatter.ofPattern("EEEE dd MMM yyyy")));
        }
    }

    @Test
    void testGiveAllSaturdays() {
        LocalDate today = LocalDate.now();
        List<LocalDate> allSaturdays = subject.giveAllSaturdaysPerYear(today.getYear());
        for (LocalDate saturday : allSaturdays)
            System.out.println("Next saturday: " + saturday.format(DateTimeFormatter.ofPattern("EEEE dd MMM yyyy")));
    }


}
