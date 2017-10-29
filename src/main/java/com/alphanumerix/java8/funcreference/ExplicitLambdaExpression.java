package com.alphanumerix.java8.funcreference;


public class ExplicitLambdaExpression {
	
	public static void main(String[] args) {
		FunctionalInterface intf = (a,b) -> { System.out.println(a+b); };
		intf.executeFunction(10, 20);
	}
}
