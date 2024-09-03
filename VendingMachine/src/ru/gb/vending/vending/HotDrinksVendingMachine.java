package ru.gb.vending.vending;

import ru.gb.vending.builder.CoffeeBuilder;
import ru.gb.vending.product.Coffee;
import ru.gb.vending.product.Product;

import java.util.List;

public class  HotDrinksVendingMachine implements VendingMachine{
    private List<Product> products;
    private CoffeeBuilder coffeeBuilder;

    public HotDrinksVendingMachine() {
        coffeeBuilder = new CoffeeBuilder();
        this.products = products;
    }

    public void addCoffee(String name, double price, double volume, int temperature) {
        Coffee coffee = coffeeBuilder.build(name, price, volume, temperature);
        products.add(coffee);
    }

    public Product getProduct(String nameProduct) {
        for(Product product: products){
            if (product.getName().equals(nameProduct)){
                return product;
            }
        }
        return null;
    }
    public Coffee getProduct(String nameProduct, int volume) {
        for(Product product: products){
            if (product.getName().equals(nameProduct) && ((Coffee) product).getVolume() == volume){
                return (Coffee) product;
            }
        }
        return null;
    }

}
