package org.javaguru.kraed.lesson4;

public class Stock {
    private String name;
    private int price;
    private int minPrice;
    private int maxPrice;

    public Stock(String name, int price) {
        this.name = name;
        this.price = price;
        this.minPrice = price;
    }

    public void updatePrice(int value) {
        this.price = value;
        if (value < this.minPrice) {
            this.minPrice = value;
        } else if (value > this.maxPrice) {
            this.maxPrice = value;
        }
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }
}
