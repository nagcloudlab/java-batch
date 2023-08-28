package com.example.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ex3 {
    public static void main(String[] args) {

//        List<String> list=new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add(1,"c");
//        list.set(1,"d");

        //list.remove(1);
        //list.clear();
        //System.out.println(list.isEmpty());
        //System.out.println(list.contains("a"));
        //System.out.println(list.size());

//        List<String> list1=new ArrayList<>();
//        list1.add("a");
//        list1.add("d");
//        System.out.println(list.containsAll(list1));


//        Iterator<String> iterator=list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        // or
//
//        for (String s:list){
//            System.out.println(s);
//        }

//        ListIterator<String> listIterator=list.listIterator();
//        while (listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }
//        System.out.println();
//        while (listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }


        //---------------------------------------------------------------------

        List<String> sheet1=new ArrayList<>();
        sheet1.add("a");
        sheet1.add("b");
        sheet1.add("c");

        List<String> sheet2=new ArrayList<>();
        sheet2.add("d");
        sheet2.add("b");
        sheet2.add("f");
        sheet2.add("a");

        //sheet1.removeAll(sheet2);
        sheet1.retainAll(sheet2);

        System.out.println(sheet1);
        System.out.println(sheet2);

    }
}
