package com.example.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex1 {
    public static void main(String[] args) {


//        Map<String,String> map=new TreeMap<>();
//        Map<String,String> map=new HashMap<>();
        Map<String,String> map=new LinkedHashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("d","4");
        map.put("c","3");
        map.put("p","3");
        map.put("z","3");

        System.out.println(map);

    }
}
