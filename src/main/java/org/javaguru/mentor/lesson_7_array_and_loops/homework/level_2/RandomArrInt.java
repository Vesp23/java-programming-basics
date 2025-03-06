package org.javaguru.mentor.lesson_7_array_and_loops.homework.level_2;

import java.util.Random;

public class RandomArrInt {
    Random random = new Random();

    public int[] createRandArray (){

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int randomInt = random.nextInt(1000);
            array[i] = randomInt;
        }
        return array;
    }
    public void arrPrint (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


