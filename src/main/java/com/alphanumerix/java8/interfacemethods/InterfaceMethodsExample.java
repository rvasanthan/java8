package com.alphanumerix.java8.interfacemethods;

public interface InterfaceMethodsExample {
	
	String getText(String tecxt);
	
	default String getDisplayText(String text) {
		System.out.println(text);
		return text;
	}

}
