package programmingexamples;

public class ReverseInteger {

	public static void main(String[] args) {
		// How to reverse an Integer?
		
		
		//Solution 1: Algorithm
		int num1 = 12345;
		int rev = 0;
		
		while (num1!=0) {
			rev = rev*10 + num1%10;
			num1 = num1/10;
		}		
		System.out.println("Reverse number1 :: " + rev);
		
		
		//Solution 2: Using StringBuffer class > Reverse method
		int num2 = 345678;
		StringBuffer rev1 = new StringBuffer(String.valueOf(num2)).reverse();
		System.out.println("Reverse number2 :: " + rev1);		
	}

}
