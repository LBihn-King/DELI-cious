package com.pluralsite;

import java.util.Iterator;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private Sandwich sandwich = new Sandwich();
    private Order order = new Order();
    private char size;

    public void optionsList() {
        System.out.println("""
                1) Add Sssandwich
                2) Add Drink
                3) Add Ssside
                4) Checkout
                0) Cancel Order""");
    }

    public void breadList() {
        System.out.println("""
                1) White
                2) Wheat
                3) Rye
                4) Wrap""");
    }

    public void meatsList() {
        System.out.println("""
                1) Sssteak
                2) Ham
                3) Sssalami
                4) Roassst Beef
                5) Chicken
                6) Bacon
                7) None""");
    }

    public void  cheeseList() {
        System.out.println("""
                1) American
                2) Provolone
                3) Cheddar
                4) Ssswisss
                5) None""");
    }

    public void toppingsList() {
        System.out.println("""
                1) Lettuce
                2) Peppersss
                3) Onionsss
                4) Tomatoesss
                5) Jalapenosss
                6) Cucumbersss
                7) Picklesss
                8) Guacamole
                9) Mushroomsss
                0) None""");
    }

    public void saucesList() {
        System.out.println("""
                1) Mayo
                2) Mussstard
                3) Ketchup
                4) Ranch
                5) Thousssand Issslandsss
                6) Vinaigrette""");
    }

    public void sizeList() {
        System.out.println("""
                1) Sssmall
                2) Medium
                3) Large""");
    }

    public void welcome() {
        System.out.println("Welcome to The Devil'sss Deli, how may I sssserve you today?");
        homeScreen();
    }

    public void homeScreen() {
        System.out.println("1) New Order\n2) Exit");
        try {
            int choice = scanner.nextInt();
            if (choice == 1) {
                orderScreen();
            } else if (choice == 2) {
                System.exit(0);
            } else {
                System.out.println("Invalid input");
                homeScreen();
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.nextLine();
            homeScreen();
        }
    }

    public void orderScreen() {
        System.out.println("----Optionsss----");
        try {
            optionsList();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addSandwich(sandwich);
                    orderScreen();
                    break;
                case 2:
                    addDrink();
                    orderScreen();
                    break;
                case 3:
                    addSide();
                    orderScreen();
                    break;
                case 4:
                    checkout();
                    orderScreen();
                    break;
                case 5:
                    displayOrder();
                    orderScreen();
                    return;
                case 0:
                    cancelOrder();
                    homeScreen();
                    break;
                default:
                    System.out.println("Invalid input");
                    orderScreen();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.nextLine();
            orderScreen();
        }
    }

    public void addSandwich(Sandwich sandwich) {
        selectBread();
        selectSize();
        sandwich.setSize(size);
        selectMeat();
        selectCheese();
        selectToppings();
        order.addSandwichToOrder(sandwich);
    }

    public void selectBread() {
        System.out.println("Ssselect your bread");
        breadList();
        try{
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    sandwich.setBread("White");
                    break;
                case 2:
                    sandwich.setBread("Wheat");
                    break;
                case 3:
                    sandwich.setBread("Rye");
                    break;
                case 4:
                    sandwich.setBread("Wrap");
                    break;
                default:
                    System.out.println("Invalid input");
                    selectBread();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.nextLine();
            homeScreen();
        }
    }

    public void selectSize() {
        System.out.println("Ssselect your sssize");
        sizeList();
        try {
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    size = 'S';
                    break;
                case 2:
                    size = 'M';
                    break;
                case 3:
                    size = 'L';
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.nextLine();
            homeScreen();
        }
    }

    public void selectMeat() {
        System.out.println("Ssselect your meat");
        meatsList();
        try{
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    sandwich.setMeat("Sssteak");
                    break;
                case 2:
                    sandwich.setMeat("Ham");
                    break;
                case 3:
                    sandwich.setMeat("Sssalami");
                    break;
                case 4:
                    sandwich.setMeat("Roassst Beef");
                    break;
                case 5:
                    sandwich.setMeat("Chicken");
                    break;
                case 6:
                    sandwich.setMeat("Bacon");
                    break;
                default:
                    System.out.println("Invalid input");
                    selectMeat();
                    break;
            }
            System.out.println("Extra meat?");
            System.out.println("1) Yesss\n2) No");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    sandwich.setExtraMeat(true);
                    break;
                case 2:
                    sandwich.setExtraCheese(false);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.nextLine();
            homeScreen();
        }
    }

    public void selectCheese() {
        System.out.println("Ssselect your cheese");
        cheeseList();
        try{
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    sandwich.setCheese("American");
                    break;
                case 2:
                    sandwich.setCheese("Provolone");
                    break;
                case 3:
                    sandwich.setCheese("Cheddar");
                    break;
                case 4:
                    sandwich.setCheese("Ssswisss");
                    break;
                default:
                    System.out.println("Invalid input");
                    selectBread();
                    break;
            }
            System.out.println("Extra cheese?");
            System.out.println("1) Yesss\n2) No");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    sandwich.setExtraCheese(true);
                    break;
                case 2:
                    sandwich.setExtraCheese(false);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.nextLine();
            homeScreen();
        }
    }

    public void selectToppings() {
        System.out.println("Ssselect your toppingsss");
        toppingsList();
        try {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    sandwich.toppings.add("Lettuce");
                    break;
                case 2:
                    sandwich.toppings.add("Peppersss");
                    break;
                case 3:
                    sandwich.toppings.add("Onionsss");
                    break;
                case 4:
                    sandwich.toppings.add("Tomatoesss");
                    break;
                case 5:
                    sandwich.toppings.add("Jalapenosss");
                    break;
                case 6:
                    sandwich.toppings.add("Cucumbersss");
                    break;
                case 7:
                    sandwich.toppings.add("Picklesss");
                    break;
                case 8:
                    sandwich.toppings.add("Guacamole");
                    break;
                case 9:
                    sandwich.toppings.add("Mushroomsss");
                    break;
                case 0:
                    sandwich.toppings.add("N/A");
                    break;
                default:
                    System.out.println("Invalid input");
                    selectToppings();
                    break;
            }
            if (!(choice == 0)) {
                toppingsRedirect();
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.nextLine();
            selectToppings();
        }
    }

    public void selectSauces() {
        System.out.println("Ssselect your sssauce");
        saucesList();
        try {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    sandwich.sauces.add("Mayo");
                    break;
                case 2:
                    sandwich.sauces.add("Mussstard");
                    break;
                case 3:
                    sandwich.sauces.add("Ketchup");
                    break;
                case 4:
                    sandwich.sauces.add("Ranch");
                    break;
                case 5:
                    sandwich.sauces.add("Thousssand Issslandsss");
                    break;
                case 6:
                    sandwich.sauces.add("Vinaigrette");
                    break;
                case 0:
                    sandwich.sauces.add("N/A");
                    break;
                default:
                    System.out.println("Invalid input");
                    selectToppings();
                    break;
            }
            if (!(choice == 0)) {
                saucesRedirect();
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.nextLine();
            selectToppings();
        }
    }

    public void toppingsRedirect(){
        System.out.println("Add another topping?\n1) Yesss\n2) No");
        try{
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    selectToppings();
                    break;
                case 2:
                    selectSauces();
                    break;
                default:
                    System.out.println("Invalid input");
                    toppingsRedirect();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.nextLine();
            toppingsRedirect();
        }
    }

    public void saucesRedirect(){
        System.out.println("Add another sssauce?\n1) Yesss\n2) No");
        try{
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    selectSauces();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Invalid input");
                    saucesRedirect();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.nextLine();
            saucesRedirect();
        }
    }

    public void addDrink() {
        Drink drink = new Drink();
        order.setHasDrink(true);
        selectSize();
        drink.setSize(size);
        order.addDrinkToOrder(drink);
        orderScreen();
    }

    public void addSide() {
        System.out.println("Ssselect your ssside");
        System.out.println("1) Apple\n2) Chips\n3) Back");
        try{
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    order.setHasApple(true);
                    order.addAppleToOrder();
                    break;
                case 2:
                    order.setHasChips(true);
                    order.addChipsToOrder();
                    break;
                case 3:
                    orderScreen();
                    break;
                default:
                    System.out.println("Invalid input");
                    addSide();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.nextLine();
            addSide();
        }
    }

    public void checkout () {
        displayOrder();
        System.out.println("Confirm?\n1) Yes\n2) Cancel order.");
        try {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ReceiptFileManager receiptFileManager = new ReceiptFileManager(order);
                    receiptFileManager.saveReceipt();
                    cancelOrder();
                    break;
                case 2:
                    cancelOrder();
                    break;
                default:
                    System.out.println("Invalid input");
                    saucesRedirect();
                    break;
            }

        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.nextLine();
            checkout();
        }
    }

    public void cancelOrder() {
        order.setTotal(0.00f);
        order.items.clear();
        homeScreen();
    }

    public void displayOrder() {
        Iterator<String> orderIterator = order.getItems().iterator();
        String output;
        while (orderIterator.hasNext()) {
            output = String.valueOf(orderIterator.next());
            System.out.println(output);
        }
        System.out.printf("Total: $%.2f\n", order.getTotal());
    }
}
