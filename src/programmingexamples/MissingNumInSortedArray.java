package programmingexamples;

public class MissingNumInSortedArray {

	public static void main(String[] args) {
		// How to find a missing number from an sorted integer array
		//Ex: int num[] = {1,2,3,5}
		//Sol: 1+2+3+5 = 11
		//	   1+2+3+4+5 = 15
		// 15-11 = 4 (Missing #)
		
		int num[] = {1,2,3,5,6,7};
		int sum1 = 0;
		
		//Add all the elements of integer array
		for (int i = 0; i < num.length; i++) {
			sum1 = sum1 + num[i];
		}		
		//System.out.println(sum1);
		
		//Add all the numbers from 1-5
		int sum2 = 0;
		for (int j = 1; j <= 7; j++) {
			sum2 = sum2 + j;			
		}
		//System.out.println(sum2);
		
		System.out.println("Missing number in the sorted array is :: " + (sum2-sum1));

	}

}
