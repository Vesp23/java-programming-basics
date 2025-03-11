package org.javaguru.mentor.lesson_6_unit_testing.homework.level_7;

public class CompoundInterestCalculatorTest {
    public static void main(String[] args) {
        CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();
        test.normalTest1();
        test.interest1();
        test.interest0();
        test.interest1();
        test.interest1();
    }


    // 1. sum == 10 000, interest - 20, years - 10; exp - 61917
    public void normalTest1(){
        CompoundInterestCalculator cmp = new CompoundInterestCalculator();
        double realresult = cmp.compoundInterest(10000,20,10);
        checkResult(61917.36,realresult,"#1");
    }
    // 2. sum == 0, interest - 20, years - 10; exp - 0
    public void isTrueWhenSumZero(){
        CompoundInterestCalculator cmp = new CompoundInterestCalculator();
        double realresult = cmp.compoundInterest(0,20,10);
        checkResult(0,realresult,"when sum == 0");
    }
    // 3. sum == 10000, interest - 1, years - 10; exp - 11046
    public void interest1(){
        CompoundInterestCalculator cmp = new CompoundInterestCalculator();
        double realresult = cmp.compoundInterest(10000,1,10);
        checkResult(11046.22,realresult,"when interest == 1");
    }
    // 4. sum == 10000, interest - 0, years - 10; exp - 10 000
    public void interest0(){
        CompoundInterestCalculator cmp = new CompoundInterestCalculator();
        double realresult = cmp.compoundInterest(10000,0,10);
        checkResult(10000,realresult,"when interest == 0");
    }
    // 5. sum == 10000, interest - 20, years - 0; exp - 10 000
    public void years0(){
        CompoundInterestCalculator cmp = new CompoundInterestCalculator();
        double realresult = cmp.compoundInterest(10000,20,0);
        checkResult(10000,realresult,"when years == 0");
    }
    public void checkResult(double expResult, double result, String testName) {
        double epsilon = 0.01d;
        if (Math.abs(expResult - result) < epsilon) {
            System.out.println("Test " + testName + " passed.");
        } else {
            System.out.println("Test " + testName + " failed.");
            System.out.println("Expected result = " + expResult);
            System.out.println("Real result = " + result);
        }

    }
}
