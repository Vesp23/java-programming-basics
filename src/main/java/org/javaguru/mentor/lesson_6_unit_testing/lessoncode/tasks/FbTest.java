package org.javaguru.mentor.lesson_6_unit_testing.lessoncode.tasks;

public class FbTest {
    public static void main(String[] args) {
        FbTest test = new FbTest();
        test.fbtest1();
        test.fbtest2();
        test.fbtest3();
        test.fbtest4();

    }
    // 1 test = 30 -> FizzBuzz
    // 2 test = 18 -> Fizz
    // 3 test = -25 -> Buzz
    // 4 test = 17 -> 17

    public void fbtest1(){
        FizzBuzz first = new FizzBuzz();
        String realRes = first.detect(30);
        checkRes(realRes, "FizzBuzz","1");
    }

    public void fbtest2(){
        FizzBuzz first = new FizzBuzz();
        String realRes = first.detect(18);
        checkRes(realRes, "Fizz","2");
    }

    public void fbtest3(){
        FizzBuzz first = new FizzBuzz();
        String realRes = first.detect(-25);
        checkRes(realRes, "Buzz","3");
    }

    public void fbtest4(){
        FizzBuzz first = new FizzBuzz();
        String realRes = first.detect(17);
        checkRes(realRes, "17","4");
    }

    public void checkRes(String realRes, String expRes, String testName){
        if (realRes.equals(expRes)) {
            System.out.println("Test " + testName + " = OK");
        } else {
            System.out.println("Test " + testName + " = OK");
            System.out.println("Real result = " + realRes );
            System.out.println("Expected result = " + expRes );
        }
    }
}
