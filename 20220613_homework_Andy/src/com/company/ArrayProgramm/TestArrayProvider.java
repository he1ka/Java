package com.company.ArrayProgramm;

import java.util.ArrayList;

/** Тестовый провайдер массива - фиксированный массив данных */
public class TestArrayProvider implements ArrayProvider{
    @Override
    public ArrayList<Integer> getArray() {
        ArrayList<Integer> returnArray = new ArrayList<>();

        returnArray.add(1);
        returnArray.add(2);
        returnArray.add(3);
        returnArray.add(4);
        returnArray.add(5);

        return returnArray;
    }
}
