package Intermediate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WorkingWithFiles {

	public static void main(String[] args) throws IOException {
		//create 5 person objects
		PersonFile person1 = new PersonFile("Pawan", "QA trainee", 27);
		PersonFile person2 = new PersonFile("John", "Consultant", 30);
		PersonFile person3 = new PersonFile("Jack", "QA trainee", 22);
		PersonFile person4 = new PersonFile("Safeeq", "QA trainer", 35);
		PersonFile person5 = new PersonFile("Daniel", "Student", 30);
		//add 5 people to arraylist
		ArrayList<PersonFile> people = new ArrayList<PersonFile>();
		people.add(person1);
		people.add(person2);
		people.add(person3);
		people.add(person4);
		people.add(person5);
		//create a file and write array details to file
		File file = new File("PersonFile.txt");
		file.createNewFile();
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		//set comma as delimiter
		for(PersonFile pf: people){
			writer.write(pf.name + ",");
			writer.write(pf.occupation+ ",");
			writer.write(pf.age + "");
			writer.newLine();
		}
		writer.flush();
		writer.close();
		//create a list to copy from file
		ArrayList<PersonFile> copylist = new ArrayList<PersonFile>();
		FileReader reader = new FileReader("PersonFile.txt");
		BufferedReader br = new BufferedReader(reader);
		PersonFile personcopy;
		String person;
		String[] attributes;
		while((person=br.readLine())!= null){
			attributes = person.split(",");
			personcopy = new PersonFile(attributes[0], attributes[1], Integer.parseInt(attributes[2]));			
			copylist.add(personcopy);
		}
		
		for(PersonFile pf: copylist){
			System.out.println(pf.name +" "+ pf.occupation+ " "+ pf.age);
		}

		
	}

}
