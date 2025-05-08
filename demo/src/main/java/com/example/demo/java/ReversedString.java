package com.example.demo.java;
//String str="hello world java programming";

//Reverse the string in java using for loop





//apexon
public class ReversedString {
	
public static void main(String args[]) {
	String str="hello world java programming";
	String reversed ="";
	for(int i = str.length()-1; i>=0; i--) {
		reversed += str.charAt(i);
	}
	
	System.out.println("Reversed string is : "+ reversed);
}
}
