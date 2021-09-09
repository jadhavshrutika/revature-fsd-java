package com.revature.app.abstraction;

public class InterfaceImpl implements Interface {

	@Override
	public void abstractMethod() {
		
	}

	public static void main(String[] args) {
		Interface interface1 = new InterfaceImpl();
		interface1.abstractMethod();
		
		//Interface interface2 = new Interface();
	}

	}


