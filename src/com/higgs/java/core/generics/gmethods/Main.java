package com.higgs.java.core.generics.gmethods;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        userForStringList();
        userForIntegerList();
    }

    private static void userForStringList() {
        String stringElement = "stringElement";
        List<String> stringList = new ArrayList<String>();

        String theElement = Utils.addAndReturn(stringElement, stringList);
        Utils.print(stringList);
    }

    private static void userForIntegerList() {
        Integer integerElement = new Integer(123);
        List<Integer> integerList = new ArrayList<Integer>();

        Integer theElement = Utils.addAndReturn(integerElement, integerList);
        Utils.print(integerList);
    }

}
