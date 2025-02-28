package com.example.demo.java;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a string, count the occurrence of each character.
public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "hello";

        Map<Character, Long> charCount = input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Character Frequency: " + charCount);
    }
}
