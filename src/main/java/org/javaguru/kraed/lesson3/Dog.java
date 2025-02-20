package org.javaguru.kraed.lesson3;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String voice (){
        return "My name is " + this.name;
    }

    public void Birthday() {
        this.age = this.age + 1;
    }

    public int whatAge(){
        return this.age;
    }

    public static void main(String[] args) {
        Dog sharik = new Dog("sharik", 4);
        System.out.println(sharik.voice());
        sharik.Birthday();
        System.out.println(sharik.whatAge());

    }
}
