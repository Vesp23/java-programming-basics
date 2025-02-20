package org.javaguru.kraed.lesson2;
import java.util.Scanner;

public class CircleTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        double raduis = scanner.nextDouble();

        double area = (raduis * raduis) * Math.PI;
        System.out.println("Площадь равна - " + area);

        double perim = 2 * Math.PI * raduis;
        System.out.println("Периметр же равен - " + perim);

    }
}
