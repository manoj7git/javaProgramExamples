package programmingexamples;

public class SwaptwoNumbers {

	public static void main(String[] args) {
		// Different ways of Swapping numbers
		
		int a = 10;
		int b = 20;
		
		/*
		//1. Using temp/3rd variable
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);
		*/
		
		//************************
		//Without using temp/3rd variable:
		//************************
		
		/*//2. Using + and - operator
		a = a+b; //30
		b = a-b; //10
		a = a-b; //20
		
		System.out.println(a);
		System.out.println(b);*/
		
		//************************
		
		/*//3. Using * and / operator
		a = a * b; // 200
		b = a / b; // 10
		a = a / b; // 20

		System.out.println(a);
		System.out.println(b);*/
		
		//************************
		
		//4. Using ^ bitwise operator
		a = a ^ b; // 30
		b = a ^ b; // 10
		a = a ^ b; // 20

		System.out.println(a);
		System.out.println(b);

	}

}
