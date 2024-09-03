package ru.gb.vending.vending;

import ru.gb.vending.product.Product;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    Product getProduct(String name);

//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("Список продуктов:\n");
//        for (Product product : products) {
//            stringBuilder.append(product);
//            stringBuilder.append("\n");
//        }
//
//        return stringBuilder.toString();
//    }
}
