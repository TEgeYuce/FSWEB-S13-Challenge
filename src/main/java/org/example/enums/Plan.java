package org.example.enums;

public enum Plan {

    BASIC("plan" ,20);

    private String name;
    private int price;

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

}
