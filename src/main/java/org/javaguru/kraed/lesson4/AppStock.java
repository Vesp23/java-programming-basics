package org.javaguru.kraed.lesson4;

public class AppStock {
    public static void main(String[] args) {
        Stock vk = new Stock("Vkontakte", 1000);
        vk.updatePrice(1500);
        vk.updatePrice(1300);
        vk.updatePrice(800);
        vk.updatePrice(1600);
        vk.updatePrice(1560);

        System.out.println("Name: " + vk.getName());
        System.out.println("Cost: " + vk.getPrice());
        System.out.println("Minimal cost: " + vk.getMinPrice());
        System.out.println("Maximum cost: " + vk.getMaxPrice());
    }
}
