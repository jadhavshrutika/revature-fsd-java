package com.revature.app.varargsDemo;

public class VarargsDemo {

	public static void main(String[] args) {
		System.out.println(add(1,2,3,5));
		
//var args defined by... 3 dots
	}
	public static int add(int ... numbers) {
		int total =0;
		for(int number: numbers) {
			total += number;
			
		}
		return total;
		
	}

}
