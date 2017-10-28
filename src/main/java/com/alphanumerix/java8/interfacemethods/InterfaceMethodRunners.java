package com.alphanumerix.java8.interfacemethods;

public class InterfaceMethodRunners {
	
	public static void main(String args[]) {
		InterfaceMethodsExample intf = new InterfaceMethodsExample() {
			
			@Override
			public String getText(String text) {
				// TODO Auto-generated method stub
				System.out.println("TEXT TO BE DISPLAYED:"+text);
				return text;
			}
		};
		
		intf.getDisplayText("This is a display text");
		intf.getText("This is just a text");
	}

}
