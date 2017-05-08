package Advanced;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnagramHash {

	public static void main(String[] args) throws IOException {
		Anagrams anagram = new Anagrams();
		anagram.readFromFile();
		String[] sortedArray= new String[anagram.arr.size()];
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		for(int i=0; i<anagram.arr.size();i++){
			sortedArray[i]=anagram.sortedVersion(anagram.arr.get(i));
		}
		String key;
		ArrayList<String> temp;
		for(int i=0;i<sortedArray.length;i++){
			key= sortedArray[i];
			if(!map.containsKey(key)){
				temp = new ArrayList<String>();
				temp.add(anagram.arr.get(i));
				for(int j=i+1;j<sortedArray.length;j++){
					if(key.equals(sortedArray[j])){
						temp.add(anagram.arr.get(j));
					}
				}
				map.put(key, temp);
			}
		}
		int biggestlength=0;
		String word="";
		for(Map.Entry<String, ArrayList<String>> entry: map.entrySet()){
			if(entry.getValue().size()>biggestlength){
				biggestlength = entry.getValue().size();
				word = entry.getKey();
			}else if(entry.getValue().size()==biggestlength){
				word+=","+entry.getKey();
			}
		}
		if(word.contains(",")){
			String[] words = word.split(",");
			StringBuilder sb = new StringBuilder();
			sb.append(map.get(words[0]).get(0));
			int lengthofword = words[0].toCharArray().length;
			for(int i=1; i<words.length;i++){
				if(words[i].toCharArray().length > lengthofword){
					lengthofword=words[i].toCharArray().length;
					sb = new StringBuilder();
					sb.append(map.get(words[i]).get(0));
				}else if(words[i].toCharArray().length == lengthofword){
					sb.append(", " +map.get(words[i]).get(0));
				}
			}
			System.out.println("Anagrams found were: "+sb);
		}else{
			System.out.println("Anagrams found were: "+map.get(word).get(0));
		}
	}

}
