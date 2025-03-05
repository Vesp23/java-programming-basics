package org.javaguru.kraed.lesson4;

import java.util.Scanner;

public class Komissia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите сумму для снятия: ");
        int input = scanner.nextInt();
        int komsa = 0;

        if (input < 1000) {
            komsa = input / 100 * 3;
        } else if (input < 5000) {
            komsa = input / 100 * 4;
        } else {
            komsa = input / 100 * 5;
        }

        System.out.println("Комиссия составит " + komsa + " рублей");

    }

}
