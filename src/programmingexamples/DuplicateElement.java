package programmingexamples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		// How to fetch Duplicate element in a String array.
		
		String names[] = {"Ajay", "Mohan", "Bikash", "Vittal", "Rahul", "Ajay", "Bikash"};
		
		//Solution 1: Using 2 For loops (Worst soltn, as time complexity high: O(n*n), where array got 
		//more elements time taken is more either)
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element is :: " +names[i]);
				}
			}			
		}
		
		System.out.println("**********Using Hash Set ********************");
		//Solution 2: Using HashSet, Time complexity: O(n)
		//As HashSet stores only Unique element
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("Duplicate element is :: " + name);
			}
		}
		
		System.out.println("**********Using Hash Map ********************");
		//Solution 2: Using HashMap, Time complexity: O(n)
		//As HashMap stores Key-Value pair
		
		Map<String, Integer> hm = new HashMap<String, Integer>();
		
		for (String name : names) {
			if (hm.containsKey(name)) {
				hm.put(name, hm.get(name)+1);
			}else {
				hm.put(name, 1);
			}
		}
			
		//Print the Map
		Set<Map.Entry<String, Integer>> entryset = hm.entrySet();
		for (Map.Entry<String, Integer> entry : entryset) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
		


	}

}
