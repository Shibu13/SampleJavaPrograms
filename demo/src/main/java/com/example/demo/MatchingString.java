package com.example.demo;
//list of strings and print the string that matches if they have the same length 

//ram=man, sita =gita

import java.util.*;
import java.util.stream.Collectors;
public class MatchingString {
	public static void main(String args[]) {
		
		List<String> words = Arrays.asList("apple","mango","ram","shyam","ant","mohit","shibuuu");
//		Map<Integer, List<String>> byLength = words.stream().collect(Collectors.groupingBy(String::length));
//		byLength.values().stream().filter(list->list.size()>1).forEach(System.out::println);
		String results = words.stream().collect(Collectors.groupingBy(String::length)).values().stream().filter(list->list.size()>1).
				map(list->String.join(", " , list)).collect(Collectors.joining(" | "));
		System.out.println(results);
		
		
	}

}
