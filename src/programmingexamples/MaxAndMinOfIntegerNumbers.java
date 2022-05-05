package programmingexamples;

public class MaxAndMinOfIntegerNumbers {

	public static void main(String[] args) {
		
		maxOfInteger(10, 20, 30);
		minOfInteger(10, 20, 30);

	}
	
	public static void maxOfInteger(int a, int b, int c) {
		int max= 0;
		while (a>0 || b>0 || c>0) {
			a--;
			b--;
			c--;
			max++;
		}
		System.out.println("Max value: "+max);
		
	}
	
	public static void minOfInteger(int a, int b, int c) {
		int min= 0;
		while (a>0 && b>0 && c>0) {
			a--;
			b--;
			c--;
			min++;
		}
		System.out.println("Min value: "+min);
		
	}

}
