package com.company.WebShop;

/**
 * Imagine you are developing a system for on-line shop (or for a hotel or for a school
 * or for a hospital or ....... for whatever area you want). Describe several classes
 * and create objects of these classes
 *
 * Представьте, что вы разрабатываете систему для интернет-магазина
 * (или для отеля, или для школы, или для больницы, или ....... для любой области, которую вы хотите).
 * Описать несколько классов и создать объекты этих классов
 */

public class Product {
    String name;
    String description;
    String brand;
    Price price;

    public Product(String name, String description, String brand, Price price) {
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.price = price;
    }
}
