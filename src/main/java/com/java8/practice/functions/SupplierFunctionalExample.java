package com.java8.practice.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import com.github.javafaker.Faker;

public class SupplierFunctionalExample {

	private List<User> userList;

	public SupplierFunctionalExample() {
		super();
		userList = new ArrayList<>();
	}

	private Supplier<User> supplierUserFunc = () -> {
		return userList.get(0);
	};

	public static void main(String[] args) {
		SupplierFunctionalExample supplierFunction = new SupplierFunctionalExample();
		Faker faker = Faker.instance();

		for (int i = 0; i < 100; i++) {
			User user = new User();
			user.setId(generateRandomNo(1000, 1));
			user.setRank(generateRandomNo(50, 1));
			user.setName(faker.name().fullName());
			supplierFunction.userList.add(user);
		}
		
		System.out.println(supplierFunction.supplierUserFunc.get());

	}

	private static int generateRandomNo(int high, int low) {
		Random r = new Random();
		int result = r.nextInt(high - low) + low;
		return result;
	}

}
