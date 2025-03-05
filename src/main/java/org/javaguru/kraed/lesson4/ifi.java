package org.javaguru.kraed.lesson4;

import java.util.Scanner;

public class ifi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int input1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int input2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int input3 = scanner.nextInt();
        if (input1 > input2) {
            if (input1 > input3) {
                System.out.println("Наибольшее " + input1);
            } else {
                System.out.println("Наибольшее " + input3);
            }
        } else {
            if (input2 > input3) {
                System.out.println("Наибольшее " + input2);
            } else {
                System.out.println("Наибольшее " + input3);
            }
        }

    }


}



