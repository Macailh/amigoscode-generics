package com.salvadorgerman.examples;

public class Example2 {
    public static void main(String[] args) {
        // without a generic, we get a class cast exception because we cannot comparte a integer with a string
//        Comparable number = 10;
//        number.compareTo("10");

        // with a generic, we get a compilation error incompatible types
        Comparable<Integer> number = 10;
//        number.compareTo("10");
//        with comparteTo, we get a 0 if is equal, a -1 if is major and 1 if is minor
        System.out.println(number.compareTo(10));

//        generics provides compile time checking and remove class cast exceptions

        Comparable letter = 'a';
        System.out.println(letter.compareTo('A'));
    }
}
