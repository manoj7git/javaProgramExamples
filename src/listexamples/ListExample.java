package listexamples;
import java.util.ArrayList;

public class ListExample {
	
	ArrayList<Double> al = new ArrayList<Double>();
	Double sum = 0.0;		

	void addToList() {
		al.add(120.33);
		al.add(111.33);
		al.add(102.33);
		al.add(912.33);
	}
	
	void display() {
		for (Double i : al) {
			sum = sum+i;
			//System.out.println(sum);
		}
		System.out.println(sum);
	}


	public static void main(String[] args) {

		ListExample obj1 = new ListExample();
		obj1.addToList();
		obj1.display();

	}

}
