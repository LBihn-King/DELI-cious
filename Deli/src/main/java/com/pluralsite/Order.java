package com.pluralsite;

import java.util.ArrayList;

public class Order {
    private boolean hasChips;
    private boolean hasApple;
    private boolean hasDrink;
    private ArrayList<String> items;
    private double total;

    public Order(boolean hasChips, boolean hasApple, boolean hasDrink, ArrayList<String> items, double total) {
        this.hasChips = hasChips;
        this.hasApple = hasApple;
        this.hasDrink = hasDrink;
        this.items = items;
        this.total = total;
    }

    public Order() {
        this.hasChips = hasChips;
        this.hasApple = hasApple;
        this.hasDrink = hasDrink;
        this.items = new ArrayList<>();
        this.total = total;
    }

    public boolean getHasChips() {
        return hasChips;
    }

    public void setHasChips(boolean hasChips) {
        this.hasChips = hasChips;
    }

    public boolean getHasApple() {
        return hasApple;
    }

    public void setHasApple(boolean hasApple) {
        this.hasApple = hasApple;
    }

    public boolean GetHasDrink() {
        return hasDrink;
    }

    public void setHasDrink(boolean hasDrink) {
        this.hasDrink = hasDrink;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    public void addAppleToOrder() {
        if (hasApple) {
            String item = "Apple\t" + "$6.66";
            items.add(item);
            setTotal(getTotal() + 6.66f);
        }
    }

    public void addChipsToOrder() {
        if (hasChips) {
            String item = "Chips\t" + "$1.50";
            items.add(item);
            setTotal(getTotal() + 1.50f);
        }
    }

    public void addDrinkToOrder(Drink drink) {
        if (hasDrink) {
            drink.pricing(drink);
            String item = String.format("Drink\t" + "$%.2f", drink.getPrice());
            items.add(item);
            setTotal(getTotal() + drink.getPrice());
        }
    }


}
