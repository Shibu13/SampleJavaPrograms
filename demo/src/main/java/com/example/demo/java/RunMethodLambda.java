package com.example.demo.java;
//write run method in Lamda expression


public class RunMethodLambda {
	public static void main(String args[]) { 
	
	Runnable r = ()-> {
		System.out.println("Running my lambda expression");
};
r.run();
}
}
