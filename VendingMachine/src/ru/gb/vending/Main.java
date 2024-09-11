package ru.gb.vending;

import ru.gb.vending.actor.Human;
import ru.gb.vending.market.Market;
import ru.gb.vending.product.Coffee;
import ru.gb.vending.vending.HotDrinksVendingMachine;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        HotDrinksVendingMachine();
        MarketB();

    }

    private static void HotDrinksVendingMachine(){
        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine();

        hotDrinksVendingMachine.addCoffee("latte", 110, 0.3, 40);
        Coffee latte = (Coffee) hotDrinksVendingMachine.addCoffee("latte", 110, 0.3, 40);


        hotDrinksVendingMachine.getProduct("latte");
        System.out.println(hotDrinksVendingMachine.getProduct("latte").toString());
    }

    private static void MarketB() {

        Human human = new Human();
        Human.name = "Vasya";

        Market market = new Market();

        market.acceptToMarket(human);
        market.takeInQueue(human);
        market.giveOrders();
        market.takeOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(human);
        market.update();
    }

}