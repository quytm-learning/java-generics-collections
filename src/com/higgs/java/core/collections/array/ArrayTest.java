package com.higgs.java.core.collections.array;

import com.higgs.java.core.common.model.User;

public class ArrayTest {

    public static void main(String[] args) {

    }

    private static void howToDeclareArray() {
        int ints;
        int intArray[];

        String[] stringArray;
        String strings[];

        User[] users;
        User userArray[];
    }

    private static void howToInit() {
        String[] strings = new String[5];
        String[] numbers = {"one", "two", "three"};

        int[] ints = new int[]{1, 2, 3, 4, 5};
        int[] intArray = {1, 2, 3, 4, 5};
    }

    private static void iteratingArray() {
        String[] numbers = {"one", "two", "three"};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number[" + i + "] = " + numbers[i]);
        }

        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
