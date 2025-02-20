package org.javaguru.kraed.lesson3;

public class RobotApp {

    public static void main(String[] args) {
        Robot robot1 = new Robot("Ivan");
        Robot robot2 = new Robot("Misha");

        robot1.setName("Gosha");
        robot2.setName("Jora");
        System.out.println(robot1.getName() + " " + robot2.getName());
    }

}
