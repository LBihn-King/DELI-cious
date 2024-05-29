package com.pluralsite;

import java.util.ArrayList;
import java.util.Arrays;

public class Sandwich {
    String bread;
    char size;
    String meat;
    String cheese;
    boolean extraMeat;
    boolean extraCheese;
    double basePrice;
    double meatPrice;
    double cheesePrice;
    double extraMeatPrice;
    double extraCheesePrice;
    ArrayList<String> toppings;

    public Sandwich(String bread, char size, String meat, String cheese, boolean extraMeat, boolean extraCheese, double basePrice, double meatPrice, double cheesePrice, double extraMeatPrice, double extraCheesePrice, ArrayList<String> toppings) {
        this.bread = bread;
        this.size = size;
        this.meat = meat;
        this.cheese = cheese;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
        this.basePrice = basePrice;
        this.meatPrice = meatPrice;
        this.cheesePrice = cheesePrice;
        this.extraMeatPrice = extraMeatPrice;
        this.extraCheesePrice = extraCheesePrice;
        this.toppings = toppings;
    }

    public Sandwich() {
        this.bread = bread;
        this.size = size;
        this.meat = meat;
        this.cheese = cheese;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
        this.basePrice = basePrice;
        this.meatPrice = meatPrice;
        this.cheesePrice = cheesePrice;
        this.extraMeatPrice = extraMeatPrice;
        this.extraCheesePrice = extraCheesePrice;
        this.toppings = toppings;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getMeatPrice() {
        return meatPrice;
    }

    public void setMeatPrice(double meatPrice) {
        this.meatPrice = meatPrice;
    }

    public double getCheesePrice() {
        return cheesePrice;
    }

    public void setCheesePrice(double cheesePrice) {
        this.cheesePrice = cheesePrice;
    }

    public double getExtraMeatPrice() {
        return extraMeatPrice;
    }

    public void setExtraMeatPrice(double extraMeatPrice) {
        this.extraMeatPrice = extraMeatPrice;
    }

    public double getExtraCheesePrice() {
        return extraCheesePrice;
    }

    public void setExtraCheesePrice(double extraCheesePrice) {
        this.extraCheesePrice = extraCheesePrice;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public void pricing(Sandwich sandwich) {
        if (sandwich.getSize() == 'S') {
            sandwich.setBasePrice(5.50f);
            sandwich.setMeatPrice(1.00f);
            sandwich.setCheesePrice(0.75f);
            sandwich.setExtraMeatPrice(0.50f);
            sandwich.setExtraCheesePrice(0.30f);
        } else if (sandwich.getSize() == 'M') {
            sandwich.setBasePrice(7.00f);
            sandwich.setMeatPrice(2.00f);
            sandwich.setCheesePrice(2.25f);
            sandwich.setExtraMeatPrice(1.00f);
            sandwich.setExtraCheesePrice(0.60f);
        } else if (sandwich.getSize() == 'L') {
            sandwich.setBasePrice(8.50f);
            sandwich.setMeatPrice(3.00f);
            sandwich.setCheesePrice(2.25f);
            sandwich.setExtraMeatPrice(1.50f);
            sandwich.setExtraCheesePrice(0.90f);
        }
    }
}