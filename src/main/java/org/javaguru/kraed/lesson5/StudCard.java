package org.javaguru.kraed.lesson5;

public class StudCard {
    private int mathGrade;
    private int engGrade;
    private int peGrade;
    private int chemGrade;

    public StudCard(int mathGrade, int engGrade, int peGrade, int chemGrade) {
        this.mathGrade = mathGrade;
        this.engGrade = engGrade;
        this.peGrade = peGrade;
        this.chemGrade = chemGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public int getEngGrade() {
        return engGrade;
    }

    public int getPeGrade() {
        return peGrade;
    }

    public int getChemGrade() {
        return chemGrade;
    }
}
