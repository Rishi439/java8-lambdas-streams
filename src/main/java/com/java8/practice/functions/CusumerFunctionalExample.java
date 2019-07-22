package com.java8.practice.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

import com.github.javafaker.Faker;

public class CusumerFunctionalExample {

	private Consumer<User> userIsRanker = (user) -> {
		if (user.getRank() < 10) {
			user.setTopper(true);
		}
	};

	public static void main(String[] args) {
		CusumerFunctionalExample cusumerFExample = new CusumerFunctionalExample();
		Faker faker = Faker.instance();
		Random random = new Random();
		List<User> userList = new ArrayList<>();
		for (int i = 0; i < 15; i++) {
			User user = new User();
			user.setId(random.nextInt());
			user.setRank(generateRandomNo());
			user.setName(faker.artist().name());
			userList.add(user);
		}
		
		for (User user : userList) {
			System.out.println("0 User Name : "+user.getName()+" | User Is Topper : "+user.isTopper()+" | User Rank : "+user.getRank());
			cusumerFExample.userIsRanker.accept(user);
			System.out.println("1 User Name : "+user.getName()+" | User Is Topper : "+user.isTopper()+" | User Rank : "+user.getRank());

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
