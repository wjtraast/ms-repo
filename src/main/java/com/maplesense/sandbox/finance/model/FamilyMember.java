package com.maplesense.sandbox.finance.model;

import java.time.LocalDate;
import java.time.Period;

public enum FamilyMember {

    LIEKE("Lieke", LocalDate.of(2007, 5, 20)),
    FENNE("Fenne", LocalDate.of(2008, 9, 11)),
    MICHELLE("Michelle", LocalDate.of(2011, 5, 10));

    private String naam;
    private LocalDate geboortedatum;

    FamilyMember(String naam, LocalDate geboortedatum) {
        this.naam = naam;
        this.geboortedatum = geboortedatum;
    }

    public int calculateCurrentAge() {
        LocalDate today = LocalDate.now();
        Period age = Period.between(this.geboortedatum, today);
        return age.getYears();
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    @Override
    public String toString() {
        return "{\"FamilyMember\" : [" +
                "{ \"naam\" : \"" + naam + "\", " +
                "\"geboortedatum\" : \"" + geboortedatum + "\" }" +
                "] }";
    }
}
