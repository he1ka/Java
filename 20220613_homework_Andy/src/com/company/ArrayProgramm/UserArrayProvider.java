package com.company.ArrayProgramm;

import java.util.ArrayList;
import java.util.Scanner;

/** Спрашивает пользователя о данных и возврщает массив */
public class UserArrayProvider implements ArrayProvider{
    @Override
    public ArrayList<Integer> getArray() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> returnArray = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            returnArray.add(scanner.nextInt());
        }

        return returnArray;
    }
}
