package com.pluralsite;

public class Drink {
    char size;
    double price;

    public Drink(char size, double price) {
        this.size = size;
        this.price = price;
    }

    public Drink() {
        this.size = size;
        this.price = price;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void pricing(Drink drink) {//set prices according to size
        if (drink.getSize() == 'S') {
            drink.setPrice(2.00f);
        } else if (drink.getSize() == 'M') {
            drink.setPrice(2.50f);
        } else if (drink.getSize() == 'L') {
            drink.setPrice(3.00f);
        }
    }
}