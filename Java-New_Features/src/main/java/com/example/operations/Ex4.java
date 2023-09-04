package com.example.operations;

import com.example.model.Dish;

import java.util.List;
import java.util.Optional;

public class Ex4 {
    public static void main(String[] args) {
        List<Dish> menu= Dish.menu;
        boolean isVegetarianFriendlyMenu=
                menu
                        .stream()
                        .anyMatch(Dish::isVegetarian);
        System.out.println(isVegetarianFriendlyMenu);


        boolean isHealthyMenu=
                menu
                        .stream()
                        .allMatch(d->d.getCalories()<1000);
        System.out.println(isHealthyMenu);

        isHealthyMenu=
                menu
                        .stream()
                        .noneMatch(d->d.getCalories()>=1000);
        System.out.println(isHealthyMenu);


        Optional<Dish> vegDish= menu
                .stream()
                .filter(Dish::isVegetarian)
                .findFirst(); // terminal methods

        if(vegDish.isPresent()){
            System.out.println(vegDish.get());
        }


    }
}
