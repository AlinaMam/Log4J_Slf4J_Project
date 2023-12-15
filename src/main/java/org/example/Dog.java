package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dog {
    private static final Logger log = LoggerFactory.getLogger(Dog.class);
    String name;
    String breed;

    public Dog(String name) {
        log.trace("Конструктор собаки запущен");
        this.name = name;
        log.trace("Конструктор собаки завершен c переменной name={}, метод запущен {}", name, makeSmth());
    }

    public void makeSound() {
        System.out.println("Bark!");
    }
    private String makeSmth() {
        return "METHOD WAS INVOKED";
    }
}
