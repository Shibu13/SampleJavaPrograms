package com.example.demo.java;

import java.util.Optional;

public class OptionalClass {
	
	public static void main(String args[]) {
		Optional<String> value = Optional.ofNullable("Hi");
		value.ifPresent(v -> System.out.println("Value is "+v));
		String result = value.orElse("Default");
		System.out.println("Result :"+ result);
	}

}
