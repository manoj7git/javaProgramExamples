package basics;
import java.util.Scanner;


public class BasicCalculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double num1, num2, sum;
		System.out.println("Enter 1st number: ");
		num1 = scn.nextDouble();
		System.out.println("Enter 2nd number: ");
		num2 = scn.nextDouble();
		sum= num1 + num2;
		System.out.println("Sum of 2 numbers is: " +sum);
	}

}
