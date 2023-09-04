package com.example;

import com.example.model.Apple;
import com.example.model.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

    public static void main(String[] args) {
        List<Apple> inventory = List.of(
                new Apple(Color.RED, 60),
                new Apple(Color.RED, 150),
                new Apple(Color.GREEN, 40)
        );
        // #1, filter  apples
        System.out.println(
//                filterApples(inventory,apple -> apple.getColor() == Color¡.GREEN)
//                filterApples(inventory,apple -> apple.getColor() == Color.RED)
                filterApples(inventory, apple -> apple.getWeight() == 150)
        );
    }

    private static List filterApples(List<Apple> inventory, Predicate<Apple> condition) {
        List<Apple> output = new ArrayList<>();
        for (Apple apple : inventory) {
            if (condition.test(apple)) {
                output.add(apple);
            }
        }
        return output;
    }

}




/*

    style of programming

    1. imperative style

    => solving any problem step-by-step approach

    => intention + Implementation mixed together ( code tangling )


    2. declarative style

    => separate intention from implementation

 */