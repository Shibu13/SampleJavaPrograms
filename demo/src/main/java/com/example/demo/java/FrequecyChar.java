package com.example.demo.java;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//String str="hghhsdddhhddh";

//count the frequency of each character in java
public class FrequecyChar {
	public static void main(String args[]) {
		String str="hghhsdddhhddh";
		Map<Character, Long> freq = str.chars().filter(c -> c !=' ').
				mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		freq.forEach((character, count)->System.out.println("charcaters are : "+ character+" number of times "+ count));
	}

}
