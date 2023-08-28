package com.example.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ex1 {

    public static void main(String[] args) {

        List<String> list0=new Vector<>();
        list0.add("a");
        list0.add("b");

        List<String> list=new ArrayList<>(10);
        list.add("a");
        list.add("b");
        list.add("c");

        List<String> list1=new LinkedList<>();
        list1.add("d");
        list1.add("e");



    }
}
