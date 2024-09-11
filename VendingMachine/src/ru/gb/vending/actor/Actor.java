package ru.gb.vending.actor;

public abstract class Actor implements ActorBehaviour {
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    protected String name;

    public abstract String getName();
}
