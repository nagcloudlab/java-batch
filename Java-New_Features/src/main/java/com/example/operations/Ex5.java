package com.example.operations;

import com.example.model.Dish;

import java.util.Arrays;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {

        List<Dish> menu = Dish.menu;

        //--------------------------------------------------------------
        // map
        //--------------------------------------------------------------
        menu
                .stream()
                .map(dish -> dish.getName())
                .forEach(System.out::println);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        integers
                .stream()
                .map(n -> n * 10)
                .forEach(System.out::println);

        List<String> stringList = Arrays.asList("hello", "hi", "hey", "ola");

        stringList
                .stream()
                .map(s -> s.length())
                .forEach(System.out::println);


    }
}
