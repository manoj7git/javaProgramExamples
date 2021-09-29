package programmingexamples;

/*
 * Logic:
 * Divide the Number with all the previous numbers and if there is any whole division with reminder as 0, 
 * then its not Prime else its a Prime.
 * Start the division from 2 onwards
 */

public class PrimeNumber {
	public static void main(String[] args) {

		int i, j;

		System.out.println("Prime numbers between 1 to 50 : ");

		for (i = 1; i < 50; i++) {

			for (j = 2; j < i; j++) {

				if (i % j == 0) {

					break;
				}
			}
			if (i == j) {

				System.out.print("  " + i);
			}
		}
	}

}
