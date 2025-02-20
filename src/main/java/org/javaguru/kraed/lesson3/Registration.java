package org.javaguru.kraed.lesson3;

public class Registration {
    private String name;
    private String diagnosis;
    private int price;

    public Registration(String name, String diagnosis, int price) {
        this.name = name;
        this.diagnosis = diagnosis;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getPrice() {
        return price;
    }
}
