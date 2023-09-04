package com.example;

import java.math.BigInteger;
import java.util.function.*;

public class Ex4 {
    public static void main(String[] args) {


        Predicate<String> predicate = s -> true;
        Supplier<String> supplier = () -> "hello";
        Consumer<String> consumer = s -> {
        };
        Function<String, Integer> function = s -> Integer.parseInt(s);

        BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equals(s2);
        BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1 + s2);
        BiFunction<String, String, Integer> biFunction = (s1, s2) -> Integer.parseInt(s1 + s2);

        //----------------------------------------------------------------

        BiFunction<Integer,Integer,Integer> add=(n1,n2) -> n1+n2;
        System.out.println(add.apply(12,13));

        IntBinaryOperator intBinaryOperator = (n1,n2) -> n1+n2;
        System.out.println(intBinaryOperator.applyAsInt(12,13));

        //----------------------------------------------------------------



    }
}
