package com.higgs.java.core.generics;

import java.util.*;

public class GenericsTest {

    public static void main(String[] args) {
        beforeJava5();
        afterJava5();
    }

    private static void beforeJava5() {
        // Java <= 4
        List listOfName = new ArrayList();
        listOfName.add("Quy");
        listOfName.add("Hung");
        listOfName.add("Dung");
        listOfName.add(new Integer(1));

        System.out.println("------- list of name: ");
//        for (String name : listOfName) {
//            System.out.println(name);
//        }
    }

    private static void afterJava5() {
        // Java <= 4
        List<String> listOfName = new ArrayList<String>(2);
        listOfName.add("Quy");
        listOfName.add("Hung");
        listOfName.add("Dung");
//        listOfName.add(new Integer(1));

        System.out.println("------- list of name: ");
        for (String name : listOfName) {
            System.out.println(name);
        }
    }

    private static void howToInitGenerics() {

        // Java <= 4, not have Generics
        List countries = new ArrayList();

        // Java >= 5, with Generics
        List<String> names = new ArrayList<>();
        List<String> addresses = new ArrayList<String>();

        Set<String> set = new HashSet<String>();
        Map<Integer, String> map = new HashMap<Integer, String>();

    }

    private static void howToUserCollectionsWithGenerics() {
        // List
        List<String> names = new ArrayList<>();
        names.add("Quy");
        names.add("Hung");
        names.add("Dung");
        for (String name : names) {
            System.out.println(name);
        }

        // Set
        Set<String> set = new HashSet<String>();
        for(String aString : set) {
            System.out.println(aString);
        }

        // Map
        Map<Integer, String> map = new HashMap<Integer, String>();
        //... add key, value pairs to the Map
        for(Integer aKey : map.keySet()) {
            String aValue = map.get(aKey);
            System.out.println("" + aKey + ":" + aValue);
        }
        for(String aValue : map.values()) {
            System.out.println(aValue);
        }
    }

}
