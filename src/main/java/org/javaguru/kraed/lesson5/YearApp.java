package org.javaguru.kraed.lesson5;

import java.util.Scanner;

public class YearApp {
    public static void main(String[] args) {
        VisYear v = new VisYear();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int input = scanner.nextInt();

        System.out.println("Год " + input + " " + v.defineYear(input) );
    }
}
