package com.example.demo.java;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxRepeat {
	public static void main(String args[]) {
		Map<String, List<String>> orders = new HashMap();
		orders.put("order1", Arrays.asList("item1", "item2"));
		orders.put("order2", Arrays.asList("item3", "item2"));
		orders.put("order3", Arrays.asList("item2", "item1"));
		List<String> allItems = orders.values().stream().flatMap(List::stream).collect(Collectors.toList());
		Map<String, Long> itemNo = allItems.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		long max = Collections.max(itemNo.values());
		List<String> mostFrequentItem = itemNo.entrySet().stream().filter(entry -> entry.getValue() == max)
				.map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Most frequent item " + mostFrequentItem + "Number of times " + max);
	}
}
