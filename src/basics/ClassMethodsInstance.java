package basics;
import java.util.Scanner;

public class ClassMethodsInstance {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Account Number in integer format: ");
		int temp = scn.nextInt();
		
		ClassMethodsInstance1 childclass = new ClassMethodsInstance1();
		childclass.SetAccountNum(temp);
		childclass.displayAccNum();		
		
	}

}
