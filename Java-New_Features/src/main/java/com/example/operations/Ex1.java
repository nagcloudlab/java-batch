package com.example.operations;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 5, 7, 11, 13};
        OptionalDouble result = Arrays.stream(numbers)
                .average();
        System.out.println(result);

    }
}
