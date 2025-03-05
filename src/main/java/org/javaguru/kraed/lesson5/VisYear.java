package org.javaguru.kraed.lesson5;

public class VisYear {

    public boolean defineYear (int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        } else {
            return false;
        }
    }
}
