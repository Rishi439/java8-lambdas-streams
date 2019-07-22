package com.java8.practice.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.github.javafaker.Faker;

public class StreamsPractice {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List<String> movieName = new ArrayList<>();
		Faker faker = Faker.instance();
		for (int i = 0; i < 10; i++) {
			movieName.add(faker.team().name());
		}
		
		movieName.stream().filter(m -> m.startsWith("M")).distinct().forEach((Consumer<? super String>) Collectors.toList());
		
		
	}

}
