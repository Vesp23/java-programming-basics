package org.javaguru.kraed.lesson5;

import java.util.Scanner;

public class TaxxApp {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Введите величину налога: ");
        int input = scanner.nextInt();

        Taxx t = new Taxx();
        System.out.print("Величина налога - ");
        System.out.print(t.countTaxx(input));
    }


}
