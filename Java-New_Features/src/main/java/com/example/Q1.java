package com.example;

import com.example.model.Dish;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
    public static void main(String[] args) {
        List<Dish> menu = Dish.menu;
        //  // display Low-caloric ( < 400) dish names in sorted by calorie
        System.out.println(
                findLowCaloricDishesV2(menu)
        );

    }

    private static List<String> findLowCaloricDishesV1(List<Dish> menu) {
        // step-1: filter dishes by calorie < 400
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getCalories() < 400) {
                lowCaloricDishes.add(dish);
            }
        }
        // step-2: sort by calorie
        lowCaloricDishes.sort(new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
        });
        // step-3: extract dish names
        List<String> lowCaloricDishNames = new ArrayList<>();
        for (Dish dish : lowCaloricDishes) {
            lowCaloricDishNames.add(dish.getName());
        }
        return lowCaloricDishNames;
    }
    private static List<String>  findLowCaloricDishesV2(List<Dish> menu) {
        return menu
                .stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparingInt(Dish::getCalories))
                .map(Dish::getName)
                .collect(Collectors.toList());
    }
}
