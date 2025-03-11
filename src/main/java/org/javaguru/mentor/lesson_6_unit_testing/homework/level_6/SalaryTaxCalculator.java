package org.javaguru.mentor.lesson_6_unit_testing.homework.level_6;

class SalaryTaxCalculator {

    public double calculate(double salary) {
        if (salary < 10000) {
            return CalculateSalaryLessThan10k(salary);
        } else if (salary < 50000) {
            return CalculateSalarylessThan50k(salary);
        } else if (salary > 50000) {
            return CalculateSalaryhighThan50k(salary);
        } else {
            return 0;
        }
    }
    public double CalculateSalaryLessThan10k(double salary) {
        double tax = 0;
        if (salary < 0) {
            tax = 0;
        } else {
            tax = (salary / 100) * 30;
        }
        return tax;
    }

    public double CalculateSalarylessThan50k(double salary) {
        double tax = 3000;
        tax += ((salary - 10000) / 100) * 40;
        return tax;
    }
    public double CalculateSalaryhighThan50k(double salary) {
        double tax = 19000;
        tax += ((salary - 50000) / 100) * 50;
        return tax;
    }

}
