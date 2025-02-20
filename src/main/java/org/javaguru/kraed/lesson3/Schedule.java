package org.javaguru.kraed.lesson3;

public class Schedule {
    private String dName;
    private String spec;
    private String date;
    private Registration morning;
    private Registration day;


    public Schedule(String dName, String spec, String date, Registration morning, Registration day ) {
        this.dName = dName;
        this.spec = spec;
        this.date = date;
        this.morning = morning;
        this.day = day;
    }

    public String getdName() {
        return dName;
    }

    public String getSpec() {
        return spec;
    }

    public String getDate() {
        return date;
    }

    public Registration getMorning() {
        return morning;
    }

    public Registration getDay() {
        return day;
    }
}
