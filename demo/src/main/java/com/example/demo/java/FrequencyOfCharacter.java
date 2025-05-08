package com.example.demo.java;
//Apexon 1st round

//String str="hghhsdddhhddh";

//count the frequency of each character in java using intArray and ascii value

public class FrequencyOfCharacter {
	public static void main(String args[]) {
		String str="hghhsdddhhddh";
		int[] freq = new int[256];
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[(int) ch]++;
		}
		for(int i = 0; i<freq.length; i++) {
			if(freq[i]>0) {
				System.out.println((char) i + " number of times : "+ freq[i]);
			}
		}
	}

}
