package ru.gb.vending;

import ru.gb.vending.product.Coffee;
import ru.gb.vending.vending.HotDrinksVendingMachine;

public class Main {
    public static void main(String[] args) {

        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine();

        hotDrinksVendingMachine.addCoffee("latte", 110, 0.3, 40);


        hotDrinksVendingMachine.getProduct("latte");

    }
}