package ru.gb.vending.product;

import java.io.Serializable;

public class Coffee extends Product implements Serializable {
    private  double volume;
    private int temperature;

    public Coffee(String name, double price, double volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    public double getVolume() {
        return super.volume;
    }

    public double setVolume(double volume) {
        super.volume = volume;
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public int setTemperature(int temperature) {
        this.temperature = temperature;
        return temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume: " + volume + ", temperature: " + temperature;
    }
}
