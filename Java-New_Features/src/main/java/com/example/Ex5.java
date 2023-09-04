package com.example;

import com.example.model.Dish;

import java.util.Comparator;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {


        List<Dish> dishList=Dish.menu;

        dishList
                .stream()  // build
                .filter(d->d.getCalories()>=400)  // intermediate
                .map(d->d.getCalories())  // intermediate
                .sorted((c1,c2)->Integer.compare(c2,c1))  // intermediate
                .forEach(System.out::println);  // terminal ope


    }
}
