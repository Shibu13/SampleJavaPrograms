package com.example.demo.classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Ankit");

        // Filter and collect names starting with 'A'
        List<String> result = names.stream()
                                   .filter(name -> name.startsWith("A")) // Intermediate
                                   .collect(Collectors.toList());       // Terminal
        
        //List<String> names= names.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
        System.out.println(result); // Output: [Alice]
    }
}

