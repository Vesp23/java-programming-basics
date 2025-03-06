package org.javaguru.mentor.lesson_7_array_and_loops.homework.level_3;

import java.util.Scanner;

public class CashCalculator {
    public double allSum (Cash[] cashes) {
        double summa = 0.0;
        for (int i = 0; i < cashes.length; i ++) {
            Cash cash = cashes[i];
            summa += cash.getSummary();
        }
        return summa;
    }

    public double avrgCash(Cash[] cashes) {
        if (cashes.length == 0 ){
            return 0.0;
        } else {
            double avrg = 0.0;
            int count = cashes.length;
            double summa = allSum(cashes);
            return summa / count;
        }
    }
}
