package com.revature.app.collections;


import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Person person1 = new Person("Smith", 25);
		Person person2 = new Person("Smith", 25);
		Person person3 = new Person("Stella", 32);
		Person person4 = new Person("Maria", 42);
		Person person5 = new Person("Mark", 13);

		Set<Person> personlist =new HashSet<>();
		personlist.add(person1);
		personlist.add(person2);
		personlist.add(person3);
		personlist.add(person4);
		personlist.add(person5);

	}

}
