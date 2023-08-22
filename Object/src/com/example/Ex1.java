package com.example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person extends Object {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
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
		return age == other.age && Objects.equals(name, other.name);
	}


}

public class Ex1 {

	public static void main(String[] args) {

		Person person1 = new Person("Nag", 40);

//		System.out.println(person1);
//		System.out.println(person1.toString());

		Person person2 = new Person("Nag", 40);

//		System.out.println(person1 == person2);
//		System.out.println(person1.equals(person2));

		Set<Person> set = new HashSet<>();
		set.add(person1);
		set.add(person2);
		
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		
		System.out.println(set.size());
		

	}

}
