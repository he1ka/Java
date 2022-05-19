package com.company;

public class Main {
    /**
     * Создать класс автомобиль, у которого должны быть следующие поля -
     * модель, год выпуска, цвет.
     * Создать метод печати.
     * Создать в методе main несколько объектов класса, положить их в массив и распечатать.
     */

    public static void main(String[] args) {

        Car ford = new Car("Ford Kuga", 2021, "blue");
        Car audi = new Car("Audi Q8", 2019, "green");
        Car bmw = new Car("BMW I3", 2020, "white");

        Car[] carArray = {ford, audi, bmw};
        for (int i = 0; i < carArray.length; i++) {
            carArray[i].print();
        }
    }
}
