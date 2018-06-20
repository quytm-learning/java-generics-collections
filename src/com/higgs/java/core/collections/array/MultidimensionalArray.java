package com.higgs.java.core.collections.array;

public class MultidimensionalArray {

    public static void main(String[] args) {

    }

    private static void howToDeclareAndInit() {

        int[][] intArray = new int[2][3];
        int[][] ints = {{1, 2, 3}, {4, 5, 6}};  // int[2][3];


        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }

    }
}
