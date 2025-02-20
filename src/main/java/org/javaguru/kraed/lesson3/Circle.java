package org.javaguru.kraed.lesson3;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
