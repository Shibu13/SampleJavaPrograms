package com.example.demo.java;

import java.util.Arrays;
import java.util.List;

public class SumOfEvens {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sumOfEvenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum();

        System.out.println("Sum of Even Numbers: " + sumOfEvenNumbers);
    }
}

