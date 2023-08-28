package com.example.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex {
    public static void main(String[] args) {


        //Set<String> set=new TreeSet<>();
//        Set<String> set=new HashSet<>();
        Set<String> set= new LinkedHashSet<>();
        set.add("A");
        set.add("A");
        set.add("B");
        set.add("E");
        set.add("D");
        set.add("C");
        set.add("Z");
        set.add("P");

        System.out.println(set);

    }
}
