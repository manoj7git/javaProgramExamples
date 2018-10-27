package programmingexamples;

public class MinAndMaxOfAnIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Numberarray = new int[]{9, 10, 3, 5, 6 ,7,8};
		
		//Method for finding Maximum value of an integer Array as defined below
		int MaxValue = getMax(Numberarray);
		System.out.println("Maximum value is "+MaxValue);		
		
		//Method for finding Minimum value of an integer Array as defined below
		int MinValue = getMin(Numberarray);
		System.out.println("Minimum Value is "+MinValue);
		
	}
	
	
	/*
	 * *************************************************************************************
	 * Method Definitions
	 * *************************************************************************************
	 */
	
	//Method to Get Maximum value in an Int Array
	public static int getMax(int[] inputArray){
		int Max = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > Max) {
				Max = inputArray[i];				
			}
		}
		//System.out.println(Max);
		return Max;
	}
	
	//Method to Get Minimum value in an Int Array
	public static int getMin(int[] inputArray){
		int Min = inputArray[0];
		for (int j = 1; j < inputArray.length; j++) {
			if (inputArray[j] < Min) {
				Min = inputArray[j];
			}
		}
		//System.out.println(Min);
		return Min;
	}	
	
}
