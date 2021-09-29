package programmingexamples;

/*
 * Floyd's triangle, named after Robert Floyd, is a right-angled triangle, 
 * which is made using natural numbers. It starts at 1 and consecutively 
 * selects the next greater number in the sequence.
 */

public class FloydsTriangle {

	public static void main(String[] args) {
		int i,j,k=1;
		
		outer:
		for (i = 1; i <= 7; i++) {
			
			for (j = 1; j <=7; j++) {
				if (j>i) {
					System.out.println();
					continue outer;					
				}
				System.out.print(" "+k++);
				
			}		
			
		}

	}

}
