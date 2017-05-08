package Advanced;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Anagrams {
	ArrayList<String> arr;
	public void readFromFile(){
		BufferedReader br;
		try {
			arr = new ArrayList<String>();
			br = new BufferedReader(new FileReader("anagram.txt"));
			String word;
			int i=0;
			while((word=br.readLine())!=null){
				arr.add(word);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Readline failed");
		}

	}
	public String sortedVersion(String unsortedword){
		String word = unsortedword;
		char[] characters =word.toCharArray();
		Arrays.sort(characters);
		word=new String(characters);
		return word;
	}
	
}
