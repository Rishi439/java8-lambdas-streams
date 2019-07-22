package com.java8.practice.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

import com.github.javafaker.Faker;

public class FunctionFunctionalExample {

	private static List<User> userList = new ArrayList<User>();

	private Function<String, User> userStringFunction = (name) -> {
		return userList.stream().filter((u) -> u.getName().equalsIgnoreCase(name)).findAny().get();

	};

	public static void main(String[] args) {
		Faker faker = Faker.instance();
		FunctionFunctionalExample functionalExample = new FunctionFunctionalExample();
		String dummpyName = null;
		for (int i = 0; i < 100; i++) {
			User user = new User();
			user.setId(generateRandomNo(1000, 1));
			user.setRank(generateRandomNo(50, 1));
			user.setName(faker.name().fullName());
			if (i == 50) {
				dummpyName = user.getName();
			}
			functionalExample.userList.add(user);
		}
		System.out.println(functionalExample.userStringFunction.apply(dummpyName));

	}

	private static int generateRandomNo(int high, int low) {
		Random r = new Random();
		int result = r.nextInt(high - low) + low;
		return result;
	}

}
