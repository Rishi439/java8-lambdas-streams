package com.java8.practice.functions;

import java.util.function.BiPredicate;

public class BiPredicateFunctionExample {

	public static void main(String[] args) {

		BiPredicate<User, Integer> isUserValid = (x, y) -> {
			return x.getId() == y;
		};
		
		
		
	}

}
