package programmingexamples;

public class AscendingAndDescendingOrder {

	public static void main(String[] args) {
		// Input Array of integers
		int[] IntArr = new int[]{10, 2, 4, 6, 5, 7, 8, 3};
		System.out.println("Array to Sort: 10, 2, 4, 6, 5, 7, 8, 3");
		
		//Method for Sorting an integer Array in Ascending order as defined below
		//Using sort
		
		int[] AscendingArray = sortAsc(IntArr);
		System.out.println("Ascending Order: ");
		for (int i : AscendingArray) {
			System.out.print(i+ ", ");
		}
		System.out.println("\n");
		
		//Method for Sorting an integer Array in Descending order as defined below
		int[] DescendingArray = sortDesc(IntArr);
		System.out.println("Descending Order: ");
		for (int i : DescendingArray) {
			System.out.print(i+ ", ");
		}
		System.out.println("\n");

	}
	
	
	/*
	 * *************************************************************************************
	 * Method Definitions
	 * *************************************************************************************
	 */
	
	//Method to SORT an Int Array in Ascending order
	public static int[] sortAsc(int[] In) {
		for (int i = 0; i < In.length; i++) {
			for (int j = 0; j < In.length; j++) {
				int temp = 0;
				if (In[i] < In[j]) {
					temp = In[j];
					In[j] = In[i];
					In[i] = temp;
				}
			}
		}
		return In;
	}
	
	//Method to SORT an Int Array in Descending order
	public static int[] sortDesc(int[] In) {
		for (int i = 0; i < In.length; i++) {
			for (int j = 0; j < In.length; j++) {
				int temp = 0;
				if (In[i] > In[j]) {
					temp = In[i];
					In[i] = In[j];
					In[j] = temp;
				}
			}
		}
		return In;
	}

}
