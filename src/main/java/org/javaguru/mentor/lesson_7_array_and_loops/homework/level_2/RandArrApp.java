package org.javaguru.mentor.lesson_7_array_and_loops.homework.level_2;

public class RandArrApp {
    public static void main(String[] args) {
        RandomArrInt r = new RandomArrInt();
        int[] array = r.createRandArray();
        r.arrPrint(array);
    }
}
