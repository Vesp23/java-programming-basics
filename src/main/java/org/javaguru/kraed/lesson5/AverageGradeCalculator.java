package org.javaguru.kraed.lesson5;

public class AverageGradeCalculator {
    public double avrgCalc(StudCard example){
        int _summ = example.getChemGrade() + example.getEngGrade() + example.getPeGrade() + example.getMathGrade();
        return _summ / 4;

    }
}
