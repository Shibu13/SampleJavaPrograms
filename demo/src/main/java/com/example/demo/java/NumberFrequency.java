package com.example.demo.java;
//String str="2a2b3c";

import java.util.stream.IntStream;

//output - aabbccc

//Implement the solution using java8





public class NumberFrequency {
	
	public static void main(String args[]) {
		String str = "2a2b3c";
		StringBuilder res  = new StringBuilder();
		IntStream.iterate(0, i -> i < str.length(), i -> i + 2).forEach(i -> {
			int count = Character.getNumericValue(str.charAt(i));
			char ch = str.charAt(i + 1);

			IntStream.range(0, count).forEach(j -> res.append(ch));
		});
		System.out.println("Final result : "+ res.toString());
	}

}
