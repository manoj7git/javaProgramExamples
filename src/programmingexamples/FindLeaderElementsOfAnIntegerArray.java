package programmingexamples;

public class FindLeaderElementsOfAnIntegerArray {
	
	//Finding the Leader elements of an Integer array
	//- Leader element is that number, whose right side numbers are lesser than the targeted number.
	//- In that case the extreme right element of the int. array is always one of the Leader element.
	//- In this int arracy [10, 5, 7, 4, 2]= 2, 4, 7 & 10 are the leader elements

	public static void main(String[] args) {
		int[] nums = {10, 5, 7, 4, 2};
		IntArray(nums);
	}
	
	public static void IntArray(int[] num) {
		//Find the extreme last element of the Integer array which is by default the 1st Leader element.
		//int lengthOfArray = a.length;
		//int LastPositionofelementinArray = lengthOfArray-1;
		int max = num[num.length-1];
		System.out.print("Leader Elements of the Array are: "+ max+ " ");
		
		//Check for the other leader elements of the array
		for (int i = num.length-2; i >= 0 ; i--) {
			
			if (num[i]>max) {
				max = num[i];
				System.out.print(max + " ");
			}
			
		}
	}

}
