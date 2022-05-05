package programmingexamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfAllDigitInNumber {
	//Find the Frequency Of All Digits in a Number

	public static void main(String[] args) {
		
		duplicateCount(12234445);

	}
	
	public static void duplicateCount(int num) {
		
		String num1 = Integer.toString(num);
		char[] chars = num1.toCharArray();
		
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		
		for (char c : chars) {
			if (charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c)+1);
			} else {
				charmap.put(c, 1);
			}
		}
		
		System.out.println("***********Retrieve the HashMap keyValues using Entryset**********");
		Set<Map.Entry<Character, Integer>> entrydata = charmap.entrySet();
		for (Map.Entry<Character, Integer> entry : entrydata) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			/*if (entry.getValue()>1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}*/
		}
		
		
		System.out.println("***********Retrieve the HashMap keyValues using keyset**********");
		Set<Character> keydata = charmap.keySet();
		for (Character entry : keydata) {
			System.out.println(entry + " : " + charmap.get(entry));
		}
				
	}

}
