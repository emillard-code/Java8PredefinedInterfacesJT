package com.project;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main( String[] args ) {

        // Multiple predefined functional interface implementations

        Predicate<Integer> predicate = i -> (i > 10) && (i < 100); // filter()
        Function<Integer, Integer> function = i -> i * i; // map()
        Consumer<Integer> consumer = i -> System.out.println("Printing: " + i); // forEach()
        Supplier<Integer> supplier = () -> 10; // orElseGet()

        // Using predefined functional interfaces with Java 8 Streams

        List<Integer> list = Arrays.asList(10, 20, 40, 80, 160, 320, 640);

        list.stream().filter(predicate).map(function).forEach(consumer);

        System.out.println(
                list.stream().filter(i -> i > 1000).map(function).findAny().orElseGet(supplier)
        );

    }

}