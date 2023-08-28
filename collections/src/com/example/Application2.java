package com.example;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {


        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<String> list3 = new Vector<>(); // thread-safety

//        Stack<String> stack=new Stack<>();
//        stack.add("a");
//        stack.push("b");
//        stack.push("c");

//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }

//        Queue<String> queue = new LinkedList<>();
        //Queue<String> queue = new PriorityQueue<>();
//        Queue<String> queue=new ArrayDeque<>();
//        queue.add("a");
//        queue.offer("c");
//        queue.offer("b");
//
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }


//        Set<String> set1=new HashSet<>();
//        Set<String> set2=new LinkedHashSet<>();
//        Set<String> set=new TreeSet<>();


        Map<String,String> map1=new HashMap<>();
        Map<String,String> map2=new LinkedHashMap<>();
        Map<String,String> map3=new TreeMap<>();


        for(String s:map1.keySet()){

        }


    }
}
