package com.revature.app.acessmodifieranother;

import com.revature.app.accessmodifier.PackageDemo;

public class AnotherClass {

	public static void main(String[] args) {
		PackageDemo demo=new PackageDemo();
		//demo.age is not visible bcoz its from same package
		//System.out.println(demo.age);

	}

}
