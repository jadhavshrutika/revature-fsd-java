package com.revature.app.acessmodifieranother;

public class StaticDemo {
	private int capacity=10;
	public static int age=20;
	
	public static void staticMethod() {
		 System.out.println("static method is called");
		 System.out.println(age);
		 //System.out.println(capacity);
	}

	public static void main(String[] args) {
	System.out.println(age);
	int capacity=20;
	System.out.println(capacity);
	
	StaticDemo staticDemo=new StaticDemo();
	System.out.println(staticDemo.capacity);

	}

}
