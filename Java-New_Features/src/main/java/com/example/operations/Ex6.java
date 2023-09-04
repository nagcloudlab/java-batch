package com.example.operations;

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {

        String[] menuLines = {
                "idly vada poori",
                "idly vada pongal",
                "c-biryani f-biryani",
                "f-biryani"
        };

        Arrays.stream(menuLines)
                .flatMap(line->Arrays.stream(line.split(" ")))
                .distinct()
                .forEach(System.out::println);

    }
}
