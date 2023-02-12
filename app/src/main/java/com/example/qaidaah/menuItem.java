package com.example.qaidaah;

public class menuItem {
    public Integer number;
    public String name;

    public menuItem(Integer number, String name) {
        this.number = number;
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return (number + "   -   " + name) ;
    }
}
