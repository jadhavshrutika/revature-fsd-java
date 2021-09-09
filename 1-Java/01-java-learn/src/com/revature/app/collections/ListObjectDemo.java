package com.revature.app.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListObjectDemo {

	public static void main(String[] args) {
		Person person1 = new Person("John", 15);
		Person person2 = new Person("Smith", 25);
		Person person3 = new Person("Stella", 32);
		Person person4 = new Person("Maria", 42);
		Person person5 = new Person("Mark", 13);

		List<Person> personlist =new ArrayList<>();
		personlist.add(person1);
		personlist.add(person2);
		personlist.add(person3);
		personlist.add(person4);
		personlist.add(person5);
		
		Collections.sort(personlist);
		for(Person p : personlist) {
			System.out.println(p);
		}
		System.out.println("display using iterator");
		Iterator<Person>iterator = personlist.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

	}


