package com.java8.practice.functions;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.LongPredicate;

public class PrimitiveFunction {

	IntPredicate intPredicate = (x) -> x % 2 == 0;
	DoublePredicate doublePredicate = (x) -> x % 2 == 0;
	LongPredicate longPredicate = (x) -> x % 2 == 0;

	IntConsumer intConsumer = (x) -> {

	};
	// DoubleConsumer and LongConsumer is also present
	// IntSupplier , DoubleSupplier and LongSupplier is present

	// For function point of view
	IntFunction<User> intergerFunction = (x) -> {
		return new User();
	};
	// Similarly we have Double and Long Function

	// To take a double/long/integer argument and return the same argument we have
	IntToDoubleFunction intToDoubleFunction = (x) -> {
		return 0.0;
	};
	// Similarly we have
	// intToLong/intToDobule/DoubleToInt/DoubleToLong/LongToDouble/LongToInt

	public static void main(String[] args) {

	}

}
