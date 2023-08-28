package com.example.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ex2 {
    public static void main(String[] args) {
        //compare(new Vector<>());
        compare(new ArrayList<>());
        compare(new LinkedList<>());
    }

    private static void compare(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(String.valueOf(i));
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
