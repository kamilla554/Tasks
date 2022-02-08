package com.company;

public class Items {
    private int value;
    private int price;
    private String name;

    public Items(int value, int price, String name) {
        this.value = value;
        this.price = price;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
