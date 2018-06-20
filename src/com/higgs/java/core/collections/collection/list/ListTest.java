package com.higgs.java.core.collections.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by quytm on 20/06/18.
 */
public class ListTest {

    public static void main(String[] args) {

    }

    private static void howToUseList() {
        List myList = new ArrayList();

        myList.add("Object 1");
        myList.add("Object 2");
        myList.add("Object 3");

        Iterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
        }

        for (Object object : myList) {
            // Do st
        }

        for (int i = 0; i < myList.size(); i++) {
            Object obj = myList.get(i);
        }
    }

    private static void howToUseStringList() {
        List<String> stringList = new ArrayList<>();

        stringList.add("Object 1");
        stringList.add("Object 2");
        stringList.add("Object 3");

        Iterator<String > iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
        }

        for (String object : stringList) {
            // Do st
        }

        for (int i = 0; i < stringList.size(); i++) {
            String str = stringList.get(i);
        }

    }

    private static void updateList() {
        List<String> stringList = new ArrayList<>();

        stringList.add("Object 1");
        stringList.add("Object 2");
        stringList.add("Object 3");

        stringList.remove(2);
//        stringList.remove("Object 3");

        stringList.clear();
    }

}
