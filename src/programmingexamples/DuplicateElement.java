package programmingexamples;

import java.util.HashSet;
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
		
		System.out.println("******************************");
		//Solution 2: Using HashSet, Time complexity: O(n)
		//As HashSet stores only Unique element
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("Duplicate element is :: " + name);
			}
		}

	}

}
