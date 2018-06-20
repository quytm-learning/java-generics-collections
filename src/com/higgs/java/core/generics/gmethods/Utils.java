package com.higgs.java.core.generics.gmethods;

import java.util.Collection;

public class Utils {

    static <T> T addAndReturn(T element, Collection<T> collection){
        collection.add(element);
        return element;
    }

    public static <T> void print(Collection<T> collection) {
        for (T element : collection) {
            System.out.println(element.toString());
        }
    }
}
