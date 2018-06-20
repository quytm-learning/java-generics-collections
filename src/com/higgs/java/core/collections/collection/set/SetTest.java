package com.higgs.java.core.collections.collection.set;

import com.higgs.java.core.common.model.User;

import java.util.*;

/**
 * Created by quytm on 20/06/18.
 */
public class SetTest {

    private static void implementationsOfSet() {
//        Set setA = new EnumSet();
        Set setB = new HashSet();
        Set setC = new LinkedHashSet();
        Set setD = new TreeSet();
    }

    private static void howToUseSet() {
        Set set = new HashSet();

        set.add("Element 1");
        set.add("Element 2");
        set.add("Element 3");
        set.add("Element 3");

        //access via Iterator
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
        }

        //access via new for-loop
        for (Object object : set) {
            String element = (String) object;
        }
    }

    private static void howToUseUserSet() {
        Set<User> set = new HashSet<>();

        set.add(new User("Quy", 23));
        set.add(new User("Hung", 24));
        set.add(new User("Dung", 25));

        //access via Iterator
        Iterator<User> iterator = set.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            String userName = user.getName();
        }

        //access via new for-loop
        for (User user : set) {
            String userName = user.getName();
        }
    }

    private static void updateSet() {
        Set set = new HashSet();

        set.add("Element 1");
        set.add("Element 2");
        set.add("Element 3");

        set.remove("Element 3");
    }

}
