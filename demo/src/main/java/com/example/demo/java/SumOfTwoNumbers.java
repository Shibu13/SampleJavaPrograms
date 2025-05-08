package com.example.demo.java;

import java.util.function.BiFunction;

public class SumOfTwoNumbers {
	public static void main(String args[]) {
		BiFunction<Integer, Integer, Integer> result = (a,b) -> a+b;
		int sum = result.apply(10,15);
		System.out.println("Sum = "+ sum);
	}

}
