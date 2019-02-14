package com.maplesense.sandbox.finance;

import com.maplesense.sandbox.finance.model.FamilyMember;
import com.maplesense.sandbox.finance.model.PocketMoneyScale;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ZakgeldCalculator {

    public void shareTheWelth() {
        FamilyMember lieke = FamilyMember.LIEKE;
        int age = lieke.calculateCurrentAge();
        System.out.println("Lieke is " + age + " jaar oud.");

        Double amount = PocketMoneyScale.getPocketMoneyByAge(age);
        System.out.println("Lieke krijgt " + amount + " euro zakgeld.");
    }

    public LocalDate giveNextSaturday() {
        LocalDate today = LocalDate.now();
        return today.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
    }

    public List<LocalDate> giveAllNextSaturdaysPerYear(int year) {
        List<LocalDate> allNextSaturdays = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate nextSaturday = today.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));

        while (nextSaturday.getYear() == year) {
            allNextSaturdays.add(nextSaturday);
            nextSaturday = nextSaturday.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        }

        return allNextSaturdays;
    }

    public List<LocalDate> giveAllPreviousSaturdaysPerYear(int year) {
        List<LocalDate> allPreviousSaturdaysThisYear = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate previousSaturday = today.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY));
        

        while (previousSaturday.getYear() == year) {
            allPreviousSaturdaysThisYear.add(previousSaturday);
            previousSaturday = previousSaturday.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY));
        }

        return allPreviousSaturdaysThisYear;
    }

    public List<LocalDate> giveAllSaturdaysPerYear(int year) {
        List<LocalDate> allSaturdays = giveAllPreviousSaturdaysPerYear(year);
        allSaturdays.addAll(giveAllNextSaturdaysPerYear(year));

        allSaturdays.sort(Comparator.comparing(LocalDate::getDayOfYear));
        return allSaturdays;
    }

    public void readData() {

    }

}
