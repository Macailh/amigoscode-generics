package com.salvadorgerman.examples;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {
    public static void main(String[] args) {
        // ? Wildcards
        // Unbounded wildcards
        List<Double> list = Arrays.asList(1.9, 2.4);
        List<Integer> list2 = Arrays.asList(1, 2);
        List<String> list3 = Arrays.asList("1", "2");
        print(list);
        print(list2);
        print(list3);
    }

   /* static <T extends Comparable<T & Number> void print(List<T> list) {
        list.forEach(System.out::println);
    }
    wildcard dont permit multiple parameters with &
    Bounded type dont haver upper and lower bounded (super - lower)
    Bounded type parameters allows to capture the parameters that goes inside aur method
    we can reference the type has T but dont reference the type has ?
    */

    static void print(List<?> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
            System.out.println();
        });
    }
}
