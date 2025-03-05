package org.javaguru.kraed.lesson5;

public class AvrgApp {
    public static void main(String[] args) {
        StudCard one = new StudCard(
                4,5,3,4
        );
        AverageGradeCalculator avgre = new AverageGradeCalculator();
        System.out.println("Average:" + avgre.avrgCalc(one));
    }
}
