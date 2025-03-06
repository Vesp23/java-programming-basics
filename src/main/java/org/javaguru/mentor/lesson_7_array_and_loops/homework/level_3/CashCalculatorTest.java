package org.javaguru.mentor.lesson_7_array_and_loops.homework.level_3;

public class CashCalculatorTest {
    public static void main(String[] args) {
        CashCalculatorTest test = new CashCalculatorTest();
        test.testSummaZero();
    }

    public void testSummaZero (){
        Cash[] cashes = {};
        CashCalculator c = new CashCalculator();
        double realRes = c.allSum(cashes);
        checkResult(realRes, 0.0, "ZeroSumma");
    }


    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}
