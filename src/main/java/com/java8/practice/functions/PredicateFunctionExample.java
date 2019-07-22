package com.java8.practice.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

import com.github.javafaker.Faker;

public class PredicateFunctionExample {

	private Predicate<User> isTopperUser = (user) -> {
		return user.getRank() < 10 ? true : false;
	};

	public Predicate<User> getToperUser(User user) {
		return isTopperUser;
	}

	public static void main(String[] args) {
		Faker faker = Faker.instance();
		List<User> userList = new ArrayList<>();
		for (int i = 0; i < 15; i++) {
			User user = new User();
			user.setId((int) Math.round(Math.random()));
			user.setRank(generateRandomNo());
			user.setName(faker.name().fullName());
			userList.add(user);
		}
		PredicateFunctionExample predicateFunctionExample = new PredicateFunctionExample();
		for (User user : userList) {
			System.out.println(
					"User : " + user.getName() + " | Is Topper : " + predicateFunctionExample.isTopperUser.test(user));
		}

	}

	private static int generateRandomNo() {
		Random r = new Random();
		int low = 1;
		int high = 100;
		int result = r.nextInt(high - low) + low;
		return result;
	}

}
