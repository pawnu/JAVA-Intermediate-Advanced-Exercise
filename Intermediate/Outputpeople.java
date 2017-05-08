package Intermediate;

import java.util.ArrayList;

public class Outputpeople {
	public static void main(String[] x){
		Person person1 = new Person("Pawan", 27, "QA trainee");
		Person person2 = new Person("John", 26, "QA Consultant");
		Person person3= new Person("Mary", 25, "QA Trainer");
		Person person4 = new Person("Paul", 22, "Boxer");
		Person person5 = new Person("Shaqueed", 34, "No.1 Java trainer");
		
		ArrayList<Person> arr = new ArrayList<Person>();
		arr.add(person1);
		arr.add(person2);
		arr.add(person3);
		arr.add(person4);
		arr.add(person5);
		
		for(Person p: arr){
			System.out.println(p.returnInfo());
		}
		
	}
}
