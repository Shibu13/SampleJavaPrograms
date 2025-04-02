package com.example.demo;
import java.util.*;
import java.util.stream.IntStream;

public class StockPrice {
	public static void main(String[] args) {
	
	List<Integer> prices = Arrays.asList(8,3,13,2,6,4,7,5);
	int[] minPrice = {prices.get(0)};
	int maxProfit = IntStream.range(1, prices.size()).map(i -> {
		int profit = prices.get(i) - minPrice[0];
		minPrice[0] = Math.min(minPrice[0], prices.get(i));
		return profit;
	}).max().orElse(0);
	System.out.println("maximum profit is : " +maxProfit);

}
}
