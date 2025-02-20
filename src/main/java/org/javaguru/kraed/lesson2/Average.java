package org.javaguru.kraed.lesson2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int first = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int second = scanner.nextInt();
        System.out.println("Enter 3rd number: ");
        int third = scanner.nextInt();

        double aver = (double)(first + second + third) / 3;
        System.out.println("Average is: " + aver);
    }
}
