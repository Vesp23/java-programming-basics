package org.javaguru.mentor.lesson_6_unit_testing.lessoncode.tasks;

public class OddNumTest {
    public static void main(String[] args) {
        OddNumTest test = new OddNumTest();
        test.oddTest1();
        test.oddTest2();
        test.oddTest3();
    }

    public void oddTest1(){
        // input 3 exp - true
        OddNumber odd = new OddNumber();
        boolean result = odd.isOdd(3);
        if (result == true) {
            System.out.println("Test 1 - OK");
        } else {
            System.out.println("Test 1 - Failed");
        }
    }
    public void oddTest2(){
        // input 0 exp - false
        OddNumber odd = new OddNumber();
        boolean result = odd.isOdd(0);
        if (!result) {
            System.out.println("Test 2 - OK");
        } else {
            System.out.println("Test 2 - Failed");
        }
    }
    public void oddTest3(){
        // input -2 exp - false
        OddNumber odd = new OddNumber();
        boolean result = odd.isOdd(-2);
        if (!result) {
            System.out.println("Test 3 - OK");
        } else {
            System.out.println("Test 3 - Failed");
        }
    }
}
