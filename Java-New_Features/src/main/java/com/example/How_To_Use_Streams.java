package com.example;

import java.util.List;

public class How_To_Use_Streams {

    public static void main(String[] args) {

        // steps to with streams apis
        // step-1 : create stream from data-source ( array, collection , io , etc )
        // step-2 : compose 1 or more intermediate methods to do data processing ( filter , map , ..)
        // step-3 : terminal methods to collect result

        //e.g
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
                .stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .limit(3)
                .sorted(Integer::compareTo)
                .forEach(System.out::println);

    }
}
