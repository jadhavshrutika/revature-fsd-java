package com.revature.app.abstraction;

public class ChildClass extends AbstractClass{
	

	public ChildClass(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass(10);
		childClass.abstractMethod();
		
		

	}

	@Override
	public void abstractMethod() {
		System.out.println("concrete abstract method in child class");
		
	}

}
