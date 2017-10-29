package com.alphanumerix.java8.lambdas;

public class LambdasAndFinnal {
	
	private static final String salutation = "Hello,";
	
	public static void main(String[] args) {
		GreetingService service = (message) -> System.out.println(salutation+message);
		service.sayMessage("Vasanth");
	}

}
