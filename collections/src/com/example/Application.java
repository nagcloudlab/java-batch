package com.example.util.com.example;

import com.example.util.LinkedList;

import java.util.Iterator;

public class Application {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add(0, "kiwi");
        linkedList.add("mango");


//        Iterator<String> iterator=linkedList.iterator();
//        while(iterator.hasNext()){
//            String fruit=iterator.next();
//            System.out.println(fruit);
//        }

        for(String fruit:linkedList){
            System.out.println(fruit);
        }


    }
}
