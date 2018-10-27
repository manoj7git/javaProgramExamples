package basics;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scn.nextInt();		
		
		switch(age){
		case 1:
			System.out.println("Age is 1");
			break;
		case 2:
			System.out.println("Age is 2");
			break;
		case 10:
			System.out.println("Age is 10");
			break;
		default:
			System.out.println("No valid age");
			break;
		}

	}

}
