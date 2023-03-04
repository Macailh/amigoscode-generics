package com.salvadorgerman.examples;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        // whitout a generic, we get a runtime error when we cast
        // whith generic, we get a error in compilation time
        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);

        for (Object number : numbers) {
            System.out.println((String) number);
        }
    }
}
