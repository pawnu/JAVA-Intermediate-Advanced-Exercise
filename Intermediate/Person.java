package Intermediate;

public class Person {
	String name, jobtitle;
	int age;
	public Person(String name, int age, String jobtitle){
		this.name = name;
		this.age = age;
		this.jobtitle=jobtitle;
	}
	public String returnInfo(){
		return "Name:" + name + " Age:" + age + " Job Title:" +jobtitle;
	}
}

