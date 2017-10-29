package com.alphanumerix.java8.lambdas;

/**
 * Lamda Expressions reduces the need for anonymous inner class and functions.
 * @author vasanth
 *
 */
public class LambdasSimpleExample {
	
	public static void main(String[] args) {
		MathOperation addition = (Integer a, Integer b) -> a+b;
		Integer sum = addition.operation(10, 20);
		System.out.println(sum);
		
		MathOperation subtraction = (Integer a, Integer b) -> a-b;
		Integer difference = subtraction.operation(20, 10);
		System.out.println(difference);
	}

}
