package com.revature.app.collections;

public class QueueDemo {

	public static void main(String[] args) {
		Person person1 = new Person("John", 15);
		Person person2 = new Person("Smith", 25);
		Person person3 = new Person("Stella", 32);
		Person person4 = new Person("Maria", 42);
		Person person5 = new Person("Maria", 42);
		Person person6 = new Person("Mark", 13);
		Person person7 = new Person("Abhishek", 25);
		
		Queue<Person> personQueue = new PriorityQueue<>();
		personQueue.add(person1);
		personQueue.add(person2);
		personQueue.add(person3);
		personQueue.add(person4);
		personQueue.add(person5);
		personQueue.add(person6);
		personQueue.add(person7);
		
		for (Person person : personQueue) {
			System.out.println(person);
		}
		
		Person person = personQueue.poll();
		System.out.println("Person polled: " + person);
		
		for (Person person11 : personQueue) {
			System.out.println(person11);
		}
		
		

	}

}
