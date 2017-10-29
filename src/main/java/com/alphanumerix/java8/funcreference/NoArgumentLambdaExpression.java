package com.alphanumerix.java8.funcreference;

public class NoArgumentLambdaExpression {
	public static void main(String args[]) {
		
		NoArgFunctionalInterface intf = () -> {
			System.out.println(20>10);
		};
		intf.execute();
	}
}
