package org.javaguru.kraed.lesson3;

public class DoctorApp {
    public static void main(String[] args) {
        Registration morningReg = new Registration("Ivan", "ОРВИ", 1500);
        Registration dayreg = new Registration("Daniel", "Грипп", 1000);
        Schedule first = new Schedule("John", "Лор", "20.02",morningReg, dayreg);

        System.out.println("Doctor: " + first.getdName());
        System.out.println("Speciality: " + first.getSpec());

        System.out.println("Date: " + first.getDate());
        System.out.println("Morning Registration:\n" + "patient name: " + first.getMorning().getName());
        System.out.println("Patient diagnosis: " + first.getMorning().getDiagnosis());
        System.out.println("Price: " + first.getMorning().getPrice());

        System.out.println("Day registration:\n" + "patient name: " + first.getDay().getName());
        System.out.println("Patient diagnosis: " + first.getDay().getDiagnosis());
        System.out.println("Price: " + first.getDay().getPrice());


    }
}
