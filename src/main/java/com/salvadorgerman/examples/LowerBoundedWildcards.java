package com.salvadorgerman.examples;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcards {
    public static void main(String[] args) {
        // ? Wildcards
        // Unbounded wildcards
        List<Double> list = Arrays.asList(1.9, 2.4);
        List<Integer> list2 = Arrays.asList(1, 2);
        List<Number> list3 = Arrays.asList();
        print(list2);
        print(list3);
    }

   /* static <T> void print(List<T> list) {
        list.forEach(System.out::println);
    }*/

    static void print(List<? super Integer> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
            System.out.println();
        });
    }
}
