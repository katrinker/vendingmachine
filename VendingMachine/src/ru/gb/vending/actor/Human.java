package ru.gb.vending.actor;

public class Human extends Actor {


    public static String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
}
