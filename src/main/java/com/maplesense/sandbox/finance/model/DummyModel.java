package com.maplesense.sandbox.finance.model;

public class DummyModel {

    private String type;
    private String name;
    private Integer year;

    public DummyModel(String type, String name, Integer year) {
        this.type = type;
        this.name = name;
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
