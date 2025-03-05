package org.javaguru.kraed.lesson5;

import java.util.Scanner;

public class ColorApp {
    public static void main(String[] args) {
        Color color = new Color();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цвет: ");
        int input = scanner.nextInt();

        System.out.println(color.defineColor(input));
    }
}
