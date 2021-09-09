package com.revature.app.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

Person person1 = new Person("John",1, 15);
Person person2 = new Person("Smith",2, 25);
Person person3 = new Person("Stella",3, 32);
Person person4 = new Person("Maria",4, 42);
Person person5 = new Person("Mark",5, 13);

Map<Long,Person> personMap =new HashMap<>();
personMap.put(person1.getId(), person1);
personMap.put(person2.getId(), person2);
personMap.put(person3.getId(), person3);
personMap.put(person4.getId(), person4);
personMap.put(person5.getId(), person5);

for (Long id : personMap.keySet()) {
	System.out.println("Person: " + personMap.get(id));
}

personMap.remove(1L);
System.out.println("\nMap after deletion:");
for (Long id : personMap.keySet()) {
	System.out.println("Person: " + personMap.get(id));
}




	}

}
