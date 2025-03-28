package com.example.demo;

import java.util.HashMap;
import java.util.Map;
//Wissen
public class StringPalindrome{

	public static boolean isPalindrome(String s) {
//		s = "bangalore";
		Map<Character, Integer> mapValue = new HashMap<>();
		for(char ch : s.toCharArray()) {
			mapValue.put(ch, mapValue.getOrDefault(ch,0)+1);
			
		}
		int odd = 0;
		for(int c : mapValue.values()) {
			if(c%2 != 0) {
				odd++;
			}
		}
		return odd <=1;
		
	}
	public static void main(String args[]) {
		System.out.println(isPalindrome("bangalore"));
		System.out.println(isPalindrome("malayalam"));
		System.out.println(isPalindrome("abdybayd"));
	}
}
