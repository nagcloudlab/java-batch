package com.example.operations;

import com.example.model.Dish;

import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        List<Dish> menu=Dish.menu;

        menu
                .stream()
                .forEach(System.out::println);
    }
}
