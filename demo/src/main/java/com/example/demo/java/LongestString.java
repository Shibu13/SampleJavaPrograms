package com.example.demo.java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pineapple", "kiwi");

        Optional<String> longestWord = words.stream()
            .max((s1, s2) -> s1.length() - s2.length());

        System.out.println("Longest Word: " + longestWord.orElse(null));
    }
}
