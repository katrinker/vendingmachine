package ru.gb.vending.product;

public abstract class  Product {
    private final String name;
    private final double price;
    private double volume;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "name: " + name + ", price: " + price;
    }
}
