package org.javaguru.kraed.lesson3;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите радиус круга: ");
            Scanner scanner = new Scanner(System.in);
            double input = scanner.nextDouble();
            if (input == 0){
                break;
            }

            Circle circle = new Circle(input);
            double result = circle.calculateArea(circle.getRadius());

            System.out.println("Площадь круга - " + result);
        }
    }
}
