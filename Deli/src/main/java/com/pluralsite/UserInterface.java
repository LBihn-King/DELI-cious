package com.pluralsite;

import java.util.Iterator;
import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Sandwich sandwich = new Sandwich();
    Order order = new Order();
    char size;

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
                0) Back""");
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
                    addSandwich();
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
                    testPrint();
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
            orderScreen();
        }
    }

    public void addSandwich() {
        selectBread();
        selectSize();
        selectMeat();
        selectCheese();
        selectToppings();
        orderScreen();
    }

    public void selectBread() {
        System.out.println("Ssselect your bread");
        breadList();
        try{
            int choice = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input");
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
            homeScreen();
        }
    }

    public void selectMeat() {
        System.out.println("Ssselect your meat");
        meatsList();
        int choice = scanner.nextInt();
    }

    public void selectCheese() {
        System.out.println("Ssselect your cheese");
        cheeseList();
        int choice = scanner.nextInt();
    }

    public void selectToppings() {
        System.out.println("Ssselect your toppingsss");
        toppingsList();
        int choice = scanner.nextInt();
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
            addSide();
        }
    }

    public void checkout () {

    }

    public void cancelOrder() {

    }

    public void testPrint() {
        Iterator<String> orderIterator = order.getItems().iterator();
        String output;
        while (orderIterator.hasNext()) {
            output = String.valueOf(orderIterator.next());
            System.out.println(output);
        }
        System.out.printf("Total: $%.2f", order.getTotal());
    }
}
