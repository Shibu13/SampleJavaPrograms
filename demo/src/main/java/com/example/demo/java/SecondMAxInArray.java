package com.example.demo.java;
//int a[]={1,2,3,4,5,6,7};
//apexon
//find second max element in java
public class SecondMAxInArray {
	public static void main(String args[]) {
		int a[]={1,2,3,4,5,6,7};
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i =0 ; i<a.length; i++) {
			if(a[i]> max) {
				max= a[i];
			}
		}
		
		for(int i = 0; i< a.length; i++) {
			if(a[i] > secondMax && a[i]<max) {
				secondMax = a[i];
			}
		}
		
		if(secondMax != Integer.MIN_VALUE) {
			System.out.println("Second max number is : "+ secondMax);
		}
	}

}
