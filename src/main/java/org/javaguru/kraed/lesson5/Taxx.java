package org.javaguru.kraed.lesson5;

public class Taxx {
    public float countTaxx (int value) {
        if (value < 10000) {
            return ((float) value * 0.3f);
        } else if (value < 50000) {
            return ((float) value * 0.4f);
        } else {
            return ((float) value * 0.5f);
        }
    }
}
