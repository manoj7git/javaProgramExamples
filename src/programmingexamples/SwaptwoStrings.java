package programmingexamples;

public class SwaptwoStrings {

	private int ssn;
	public static void main(String[] args) {
		// Swap two strings with & without 3rd variable
		
		String x = "Hello";
		String y = "World";
		
		//1. Without temp/3rd variable
		x = x+y; //HelloWorld
		y = x.substring(0, x.length()-y.length()); //y= Hello (y=x.substring(0,10-5)
		x = x.substring(y.length()); //World
		
		System.out.println(x);
		System.out.println(y);
		
		/*//1. With temp/3rd variable
		String z;
		z = x;   //Hello
		x = y;  //Hello
		y = z;  //World

		System.out.println(x);
		System.out.println(y);*/
		
	}
}
