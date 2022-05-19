package com.company;

import java.util.Objects;

/**
 * Создать класс автомобиль, у которого должны быть следующие поля -
 * модель, год выпуска, цвет.
 * Создать метод печати.
 * Создать в методе main несколько объектов класса, положить их в массив и распечатать.
 */
public class Car {
    String model;
    int yearOfManufacture;
    String color;

    public Car(String model, int yearOfManufacture, String color) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
    }

    public void print() {
        System.out.println("Car: " + model + " " + yearOfManufacture + " " + color);
    }
}
