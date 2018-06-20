package com.higgs.java.core.collections.hashmapequal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Quy");


        boolean containsQuy = names.contains("Quy");


        boolean removed = names.remove("Quy");

    }

}
