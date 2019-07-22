package com.java8.practice.lambda;

import com.github.javafaker.Faker;

public class LambdaPractice {
	
	
	public static void main(String[] args) {
		Faker faker = Faker.instance();
		for (int i = 0; i < 10; i++) {
			System.out.println(faker.internet().domainName());
			
		}
	}

}
