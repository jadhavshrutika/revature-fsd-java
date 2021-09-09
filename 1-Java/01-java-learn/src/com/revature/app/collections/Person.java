package com.revature.app.collections;

public class Person  {
	 
		private String name;
		private long id;
		private int age;
		
		
		

		public Person() {
			super();
		}




		public Person(String name, long id, int age) {
			super();
			this.name = name;
			this.id = id;
			this.age = age;
		}




		@Override
		public String toString() {
			return "Person [name=" + name + ", id=" + id + ", age=" + age + "]";
		}

		



		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + (int) (id ^ (id >>> 32));
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}




		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (age != other.age)
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}




		public String getName() {
			return name;
		}




		public void setName(String name) {
			this.name = name;
		}




		public long getId() {
			return id;
		}




		public void setId(long id) {
			this.id = id;
		}




		public int getAge() {
			return age;
		}




		public void setAge(int age) {
			this.age = age;
		}
		public int compareTo(Person person) {
			//Person otherPerson =(Person)o;
		//	System.out.println(this.name +" "+person.name + " "+ name.compareTo(person.name));
			//return name.compareTo(person.name);  //+ve first object comes first; -ve second obj comes first; 0 - equal
			//return age-person.age;
			return 0;
			
		}




		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}



