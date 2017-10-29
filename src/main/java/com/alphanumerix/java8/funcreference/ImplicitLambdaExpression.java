package com.alphanumerix.java8.funcreference;

public class ImplicitLambdaExpression {
	
	public static void main(String args[]) {
		FunctionalInterface intf = (Integer a, Integer b) -> { 
			System.out.println(a+b);
		};
		intf.executeFunction(10, 20);
	}
}
