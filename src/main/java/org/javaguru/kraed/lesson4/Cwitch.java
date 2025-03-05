package org.javaguru.kraed.lesson4;

import java.util.Scanner;

public class Cwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int input = scanner.nextInt();
        switch (input) {
            case 12:
                System.out.println("XII");
                break;
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
            case 10:
                System.out.println("X");
            case 11:
                System.out.println("XI");
        }
    }

}
