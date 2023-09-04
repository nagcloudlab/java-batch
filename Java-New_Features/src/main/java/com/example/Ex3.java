package com.example;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {

        List<String> menu = new ArrayList<>();
        menu.add("veg");
        menu.add("nveg");
        menu.add("nveg");
        menu.add("veg");
        menu.add("veg");

        // way-1 : imperative style
        Iterator<String> iterator = menu.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("nveg")) {
                iterator.remove();
            }
        }
        System.out.println(menu);

        //way-2 : declarative style with Functional approach
        menu.removeIf(s -> s.equals("nveg"));
        System.out.println(menu);


    }
}
