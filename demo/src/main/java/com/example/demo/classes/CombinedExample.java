package com.example.demo.classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombinedExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Filter names starting with 'A', convert to uppercase, and collect
        List<String> result = names.stream()
                                   .filter(name -> name.startsWith("A"))  // Lambda
                                   .map(String::toUpperCase)              // Method Reference
                                   .collect(Collectors.toList());        // Terminal Operation

        System.out.println(result); // Output: [ALICE]
    }
}

