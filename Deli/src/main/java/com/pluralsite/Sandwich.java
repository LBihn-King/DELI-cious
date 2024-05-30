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
        this.toppings = new ArrayList<String>();
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
        this.toppings = new ArrayList<String>();
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

    @Override
    public String toString() {
        String output;
        if (extraMeat && extraCheese) {
            output = """
                    %s %s Sandwich    $%.2f
                    %s
                    %s
                    Extra Meat        +%.2f
                    Extra Cheese      +%.2f
                    %s""".formatted(size, bread, getSandwichTotal(), meat, cheese, extraMeatPrice, extraCheesePrice, toppings);
        } else if (extraMeat) {
            output = """
                    %s %s Sandwich    $%.2f
                    %s
                    %s
                    Extra Meat        +%.2f
                    %s""".formatted(size, bread, getSandwichTotal(), meat, cheese, extraMeatPrice, toppings);
        } else if (extraCheese) {
            output = """
                    %s %s Sandwich    $%.2f
                    %s
                    %s
                    Extra Cheese      +%.2f
                    %s""".formatted(size, bread, getSandwichTotal(), meat, cheese, extraCheesePrice, toppings);
        } else {
            output = """
                    %s %s Sandwich    $%.2f
                    %s
                    %s
                    %s""".formatted(size, bread, getSandwichTotal(), meat, cheese, toppings);
        }
        return output;
    }

    public void pricing() {
        if (getSize() == 'S') {
            setBasePrice(5.50f);
            setMeatPrice(1.00f);
            setCheesePrice(0.75f);
            setExtraMeatPrice(0.50f);
            setExtraCheesePrice(0.30f);
        } else if (getSize() == 'M') {
            setBasePrice(7.00f);
            setMeatPrice(2.00f);
            setCheesePrice(2.25f);
            setExtraMeatPrice(1.00f);
            setExtraCheesePrice(0.60f);
        } else if (getSize() == 'L') {
            setBasePrice(8.50f);
            setMeatPrice(3.00f);
            setCheesePrice(2.25f);
            setExtraMeatPrice(1.50f);
            setExtraCheesePrice(0.90f);
        }
    }

    public double getSandwichTotal() {
        pricing();
        if (extraMeat && extraCheese) {
            return basePrice + meatPrice + cheesePrice + extraMeatPrice +extraCheesePrice;
        } else if (extraMeat) {
            return basePrice + meatPrice + cheesePrice + extraMeatPrice;
        } else if (extraCheese) {
            return basePrice + meatPrice + cheesePrice + extraCheesePrice;
        } else {
            return basePrice + meatPrice + cheesePrice;
        }
    }
}