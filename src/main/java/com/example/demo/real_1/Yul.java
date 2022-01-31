package com.example.demo.real_1;

import java.util.function.*;

public class Yul {

	public static void main(String[] args) {

		/**
		 * Function 연습
		 * author : Minyul
		 */
		Function<Integer, String> integerToString = number -> "내마음대로" + number;
		Function<Integer, Integer> plusFunction = number -> number + number;

		System.out.println(integerToString.apply(10));
		System.out.println(plusFunction.apply(3));

		String result = plusFunction.andThen(integerToString).apply(10);
		System.out.println(result);

		/**
		 * Function 입력 타입과 아웃풋 타입이 같을 때?
		 */
		UnaryOperator<Integer> unaryOperator = number -> 2*number;
		System.out.println(unaryOperator.apply(10));

		/**
		 * BiFunction
		 */
		BiFunction<Integer, String, Integer> biFunction = (number, age) -> Integer.parseInt(age) + number;
		System.out.println(biFunction.apply(10, "23"));
		BinaryOperator<Integer> binaryOperator = (number1, number2) -> number1 + number2;
		System.out.println(binaryOperator.apply(10, 10));

		/**
		 * Predicate 연습
		 * author : Minyul
		 */
		Predicate<String> startWtihMinyul = name -> name.startsWith("minyul");
		System.out.println(startWtihMinyul.test("minyul"));
	}
}
