package programmingexamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsFromAString {
	
	//Find the duplicate letters from the string

	public static void main(String[] args) {
		
		String s = "I love to do coding";
		char[] letters = s.toCharArray();		
		
		System.out.println("**********************By Brute force method*********************");	
		for (int i = 0; i < letters.length; i++) {
			int count =1;
			for (int j = i+1; j < letters.length; j++) {
				if (letters[i]==letters[j] && letters[i] != ' ') {
					//System.out.println(letters[j]);
					count++;
					letters[j]='0';
				}
			}
			
			if (count >1 && letters[i] != '0') {
				System.out.println(letters[i]);
			}
			
		}
		
		
		System.out.println("**********************By Hash Map method*********************");
		String s2 = "I am practicing code";
		char[] letters2 = s2.toCharArray();
		
		Map<Character, Integer> lettermap = new HashMap<Character, Integer>();
		
		for (char c : letters2) {
			if (lettermap.containsKey(c)) {
				lettermap.put(c, lettermap.get(c)+1);
			}else {
				lettermap.put(c, 1);
			}
			
		}
		
		//Retrieve the key value data from the Hashmap using entryset
		Set<Map.Entry<Character, Integer>> entrydata = lettermap.entrySet();
		for (Map.Entry<Character, Integer> entry : entrydata) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}

	}

}
