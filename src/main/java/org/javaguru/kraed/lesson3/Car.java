package org.javaguru.kraed.lesson3;

public class Car {
    private String mark;
    private String color;
    private int price;

    public Car (String mark, String color, int price) {
        this.color = color;
        this.price = price;
        this.mark = mark;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
    public String getMark(){
        return mark;
    }
}
