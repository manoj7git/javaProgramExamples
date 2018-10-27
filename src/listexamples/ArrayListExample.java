package listexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> StrArray = new ArrayList<>();	
		
		/*
		 * ***********************************
		 * How to add elements into the list is different ways
		 * ***********************************
		 */
		//Add String elements using List.add method
		StrArray.add("Mohan");
		StrArray.add("Rohan");
		StrArray.add("Sohan");
		StrArray.add("Johan");
		StrArray.add("Lohan");
		StrArray.add("Yohan");
		
		//Add elements using list.add(index, element)  
		StrArray.add(1, "Ajay");
		StrArray.add(3, "Bijay");
		StrArray.add(5, "Partha");
		StrArray.add(8, "Vicky");
		
		/*
		 * ***********************************
		 * How to add Integer elements into the list
		 * Initialization using Arrays.asList
		 * Anonymous inner class method to initialize ArrayList
		 */
		
		ArrayList<Integer> intArray1 = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 1, 7, 2));
		ArrayList<Integer> intArray2 = new ArrayList<Integer>(Arrays.asList(5, 1, 7, 3, 4, 6));
		
		/*
		 * ***********************************
		 * Different ways of retrieving data from ArrayList
		 * ***********************************
		 */
		
		//Using SystemOut.print
		System.out.println("String Array Before Sorting: " +StrArray);
		
		/*
		//Using Advanced Foreach loop
		for (String listNames : StrArray) {
			System.out.print(listNames +", ");
		}
		System.out.println("\n");
		
		
		//Using for loop with Obj.Get(index) method
		for (int i = 0; i < StrArray.size(); i++) {
			System.out.print(StrArray.get(i)+ ", ");
		}
		System.out.println("\n");
		
		//Using Iterator class
		Iterator Itr = StrArray.iterator();
		while (Itr.hasNext()) {
			System.out.print(Itr.next()+ ", ");			
		}
		*/
		
		/*
		 * ***********************************
		 * Sorting an Array in Ascending order using Collections.sort() method
		 * ***********************************
		 */
		
		//Use Collections class to Sort the String Array list
		Collections.sort(StrArray);
		System.out.println("String Array in Ascending order: " +StrArray);
		
		//Use Collections.Sort() method the Integer Array list
		Collections.sort(intArray1);
		System.out.println("Integer Array in Ascending order: " +intArray1);
		
		/*
		 * ***********************************
		 * Sorting an Array in Descending order using Collections.sort() method
		 * ***********************************
		 */
		Collections.sort(intArray2, Collections.reverseOrder());
		System.out.println("Integer Array in Desceding order: " +intArray2);
		
		
		/*
		 * ***********************************
		 * Reverse order of an Array
		 * ***********************************
		 */
		//Use Reverse method to display the reverse order of the Array 
		Collections.reverse(StrArray);
		Collections.reverse(intArray1);
		System.out.println("String Array in Reverese order: " +StrArray);
		System.out.println("Integer Array in Reverese order: " +intArray1);
		

	}

}
