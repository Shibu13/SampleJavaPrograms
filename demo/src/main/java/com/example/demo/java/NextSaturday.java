package com.example.demo.java;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class NextSaturday {
	
	public static void main(String args[]) {
		LocalDate today = LocalDate.now();
		LocalDate nextSat = today.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Next saturday is ="+ nextSat);
	}

}
