package com.java8.practice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.github.javafaker.Faker;

public class StreamsPractice1 {

	public static void main(String[] args) {

//		Stream<Integer> oddNumber = Stream.iterate(1,i -> {
//			i +=1;
//			if(i % 2 == 0) {
//				return i+1;
//			}else {
//				return i;
//			}
//		});
//		oddNumber.forEach(System.out::println);
		// Single Threaded Streams
		long timeStarted = System.currentTimeMillis();
		List<StreamsSampleModel> streamSampleModelList = getStreamsSample(100);
		streamSampleModelList.stream().filter(stream -> stream.getIndex() > 10).map(StreamsSampleModel::getName)
				.forEach(System.out::println);
		long timeEnded = System.currentTimeMillis();
		System.out.println("Time Taken : " + (timeEnded - timeStarted));

		// Parallel Streams
		long timeStarted1 = System.currentTimeMillis();
		List<StreamsSampleModel> streamSampleModelList1 = getStreamsSample(100);
		streamSampleModelList1.parallelStream().filter(stream -> stream.getIndex() > 10)
				.map(StreamsSampleModel::getName).forEach(System.out::println);
		long timeEnded1 = System.currentTimeMillis();
		System.out.println("Time Taken : " + (timeEnded1 - timeStarted1));

	}

	public static List<StreamsSampleModel> getStreamsSample(int count) {

		Faker faker = Faker.instance();
		List<StreamsSampleModel> sampleStreamsModelList = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			StreamsSampleModel streamsSampleMode = new StreamsSampleModel();
			streamsSampleMode.setCompany(faker.company().name());
			streamsSampleMode.setEmail(faker.internet().emailAddress());
			streamsSampleMode.setIndex(i);
			streamsSampleMode.setName(faker.name().fullName());
			streamsSampleMode.setUsername(faker.name().username());
			sampleStreamsModelList.add(streamsSampleMode);
		}

		return sampleStreamsModelList;

	}

}
