package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Start {
    private static final Logger log = LoggerFactory.getLogger(Start.class);

    public static void main(String[] args) {
        log.info("Какая-то информация.");
        log.trace("Что-то неважное.");
        log.error("Ошибка");
        System.out.println("Hello world!");
        Dog dog = new Dog("Tosha");
        dog.makeSound();
    }
}