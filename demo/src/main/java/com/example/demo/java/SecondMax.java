package com.example.demo.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import jakarta.persistence.GenerationType;

/*
 * 
 * 
List<Integer> list=Arrays.asList(7,9,2,1,8,6);    
        Find second max element in java8
 */
public class SecondMax {
	
	public static void main(String args[]) {
		List<Integer> list= Arrays.asList(7,9,2,1,8,6); 
		
		Optional<Integer> second = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		second.ifPresent(val -> System.out.println("Second maximum element "+ val));
		
	}

}



				



































