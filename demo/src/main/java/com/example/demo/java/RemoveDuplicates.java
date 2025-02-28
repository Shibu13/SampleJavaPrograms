package com.example.demo.java;

//Remove duplicates from a list and return a sorted list.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 5, 30, 10);

        List<Integer> uniqueSortedNumbers = numbers.stream()
            .distinct()
           .sorted()
 //           .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());

        System.out.println("Unique Sorted Numbers: " + uniqueSortedNumbers);
    }
}
