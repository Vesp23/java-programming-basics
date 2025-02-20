package org.javaguru.kraed.lesson3;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("porche", "red", 2000);
        Car car2 = new Car("BMW", "Black", 1000);
        Car car3 = new Car("Audi", "Yellow", 1500);

        car1.setColor("Black");
        car2.setMark("4etyrka");
        car3.setPrice(14000);

        System.out.println("Первая машина - " + car1.getColor() + car1.getMark() + car1.getPrice());
        System.out.println("Вторая машина - " + car2.getColor() + car2.getMark() + car2.getPrice());
        System.out.println("Третья машина - " + car3.getColor() + car3.getMark() + car3.getPrice());

    }
}
