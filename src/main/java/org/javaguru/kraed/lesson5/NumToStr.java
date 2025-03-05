package org.javaguru.kraed.lesson5;

public class NumToStr {

    public boolean Even3(int value) {
        return value % 3 == 0;
    }

    public boolean Even5(int value) {
        return value % 5 == 0;
    }

    public String ConvNum(int value) {
        if (Even3(value) && Even5(value)) {
            return "FizzBazz";
        } else if (Even5(value)) {
            return "Bazz";
        } else if (Even3(value)) {
            return "Fizz";
        } else {
            return "" + value;
        }
    }
}
