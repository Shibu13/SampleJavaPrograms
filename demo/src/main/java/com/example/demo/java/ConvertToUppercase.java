package com.example.demo.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUppercase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "spring", "microservices");

        List<String> upperCaseWords = words.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println("Uppercase Words: " + upperCaseWords);
    }
}

