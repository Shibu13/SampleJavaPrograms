package com.example.demo.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighest {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 4, 45, 99, 99};

        Optional<Integer> secondHighest = Arrays.stream(numbers)
            .distinct()
            .boxed()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst();

        System.out.println("Second Highest Number: " + secondHighest.orElse(null));
    }
}
