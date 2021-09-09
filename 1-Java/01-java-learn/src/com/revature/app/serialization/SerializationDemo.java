package com.revature.app.serialization;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.revature.app.collections.Person;

public class SerializationDemo {

	public static void main(String[] args) {
		Person person1 = new Person("Smith", 25);
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


	}

}
