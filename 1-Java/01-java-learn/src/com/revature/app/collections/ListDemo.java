package com.revature.app.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo {

	public static void main(String[] args) {
		
			Integer age=10;
			ArrayList<Integer> arraylist= new ArrayList<Integer>();
			
			arraylist.add(784);
			arraylist.add(794);
			arraylist.add(785);
			arraylist.add(795);
			arraylist.add(768);
			arraylist.add(393);
			arraylist.add(485);
			arraylist.add(696);
			
			for(Integer number:arraylist) {
				System.out.println(number);
			}
			
			System.out.println("using index");
			for(int i=0; i<arraylist.size(); i++) {
				System.out.println(arraylist.get(i));
			}
		
			System.out.println("sorting");
			
			Collections.sort(arraylist);
			for(Integer number:arraylist) {
				System.out.println(number);
			}
			
	//ctrl+shift+o ====for import
		}


	}


