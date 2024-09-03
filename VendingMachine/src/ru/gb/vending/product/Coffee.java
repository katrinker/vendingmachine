package ru.gb.vending.product;

public class Coffee extends Product {
    private  double volume;
    private int temperature;

    public Coffee(String name, double price, double volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume: " + volume + ", temperature: " + temperature;
    }
}
