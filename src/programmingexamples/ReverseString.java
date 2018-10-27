package programmingexamples;

public class ReverseString {

	public static void main(String[] args) {
		// How to reverse the characters of a String?
		//Ans: 2 Ways
		//1. Using For loop/CharAt()
		//2. Using StringBuffer class
		
		//Diff. between String & StringBuffer class?
		//- String is immutable (4 better memory management) & Final thus do not have a reverse method
		//while StringBuffer is mutable, thus has got a reverse method
		
		String s = "Selenium";
		String revStr = "";
		
		//Mthod 1: Using For loop/CharAt()
		for (int i = s.length()-1; i >= 0; i--) {
			revStr = revStr + s.charAt(i);			
		}
		System.out.println(revStr);
		
		
		//Method 2: Using StringBuffer class
		String s1 = "Java";
		
		StringBuffer sb = new StringBuffer(s1);		
		System.out.println(sb.reverse());
		
	}

}
