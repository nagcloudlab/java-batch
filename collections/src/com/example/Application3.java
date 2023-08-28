package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list=Collections.unmodifiableList(list);
        list.add("c");
        System.out.println(list);

    }
}
