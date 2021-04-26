package com.galvanize.cart;

public class Item {
    double price;
    String name;
    boolean isOnSale = false;

    public Item(String name, double price, boolean isOnSale) {
        if (price >= 0) {
            this.price = price;
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid Price");
        }

        this.isOnSale = isOnSale;
    }

    public Item(String name, double price) {
        if (price >= 0) {
            this.price = price;
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid Price");
        }

    }

    public Item (double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Invalid Price");
        }
    }
    
    public Item() {
        this.price = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getPrice() {
        return this.price;
    }
}
