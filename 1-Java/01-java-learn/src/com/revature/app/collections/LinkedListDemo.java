package com.revature.app.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		Person person1 =new Person("John",21);
		Person person2 = new Person("Smith", 25);
		Person person3 = new Person("Stella", 32);
		Person person4 = new Person("Maria", 42);
		Person person5 = new Person("Mark", 13);

		List<Person> personlist=new LinkedList<>();
		personlist.add(person1);
		personlist.add(person2);
		personlist.add(person3);
		personlist.add(person4);
		personlist.add(person5);
		
		personlist.add(1,new Person("shrutika", 21));
		for (Person person:personlist) {
			System.out.println(person);
		}

	

	}

}
