package basics;

//Overriding methods: Basically used in class Inheritance structure where the SAME method (with same NAME, Same SIGNATURE (same parameters)& same return type
//from the Super/Parent class is overridden in the child class

class areaex{
	void area(){
		System.out.println("Area definition in parent");
	}
}

class child extends areaex{
	int l = 10;
	int j = 20;
	void area(){
		int rectArea = l*j;
		System.out.println("Area of a rectangle: " +rectArea);
		super.area();
	}
}

public class Overridingex {

	public static void main(String[] args) {
		child ch1 = new child();
		ch1.area();
		areaex ch2 = new child();
		ch2.area();

	}

}
