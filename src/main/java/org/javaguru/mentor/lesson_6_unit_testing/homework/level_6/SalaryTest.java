package org.javaguru.mentor.lesson_6_unit_testing.homework.level_6;

public class SalaryTest {
    public static void main(String[] args) {
        SalaryTest test = new SalaryTest();
        test.zeroSalary();
        test.Salary33k();
        test.Salary5k();
        test.minusSalary();
        test.Salary75k();
    }
    // 1. salary == 0; exp == 0
    public void zeroSalary(){
        SalaryTaxCalculator sal = new SalaryTaxCalculator();
        double result = sal.calculate(0);
        CheckResult(0, result, "ZeroSalary");
    }
    // 2. salary == 5000; exp == 1500
    public void Salary5k(){
        SalaryTaxCalculator sal = new SalaryTaxCalculator();
        double result = sal.calculate(5000);
        CheckResult(1500, result, "5000 Salary");
    }
    // 3. salary == 33000; exp == 9900
    public void Salary33k(){
        SalaryTaxCalculator sal = new SalaryTaxCalculator();
        double result = sal.calculate(33000);
        CheckResult(12200, result, "Salary 33000");
    }
    // 4. salary == -4000; exp == 0
    public void minusSalary(){
        SalaryTaxCalculator sal = new SalaryTaxCalculator();
        double result = sal.calculate(-4000);
        CheckResult(0, result, "Salary -4000");
    }
    // 5. salary == 75000; exp == 22500
    public void Salary75k(){
        SalaryTaxCalculator sal = new SalaryTaxCalculator();
        double result = sal.calculate(75000);
        CheckResult(31500, result, "Salary 75000");
    }
    public void CheckResult(double expResult, double result, String TestName) {
        double epsilon = 0.000001d;
        if (Math.abs(result - expResult) < epsilon) {
            System.out.println(TestName + " Passed.");
        } else {
            System.out.println(TestName + " Failed.");
            System.out.println("Expected " + expResult + " but got " + result);
        }
    }
}
