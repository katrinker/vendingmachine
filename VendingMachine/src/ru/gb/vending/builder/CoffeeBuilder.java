package ru.gb.vending.builder;

import ru.gb.vending.product.Coffee;
import ru.gb.vending.product.Product;

import java.io.Serializable;

public class CoffeeBuilder implements Serializable {

    public Coffee build(String name, double price, double volume, int temperature){
        return new Coffee(name, price, volume, temperature);
    }
}

