package com.higgs.java.core.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

    }

    private static void howToUseMap() {
        Map mapA = new HashMap();

        mapA.put("key1", "element 1");
        mapA.put("key2", "element 2");
        mapA.put("key3", "element 3");

        String element1 = (String) mapA.get("key1");

        // key iterator
        Iterator keyIterator = mapA.keySet().iterator();
        while (keyIterator.hasNext()) {
            Object key = keyIterator.next();
            Object value = mapA.get(key);
        }
        //access via new for-loop
        for (Object key : mapA.keySet()) {
            Object value = mapA.get(key);
        }

        // value iterator
        Iterator valueIterator = mapA.values().iterator();
    }
}
