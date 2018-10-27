package basics;

//=> Overloading methods in a class is related to many methods with SAME NAME 
//but DIFFERENT/same SIGNATURES(different Arguments) & same or different RETURN type
//-> Overloading methods are defined in a single class with no Parent-child class format needed as in case of overridding
public class Overloadingex {
	
	void print(int i){
		System.out.println("Print method with just single parameter: " +i);		
	}
	
	void print(int i, int j){
		System.out.println("Print method with two parameter: " +i +" & " +j);		
	}
	
	void print(int i, int j, int k){
		System.out.println("Print method with three parameter: " +(i+j+k));		
	}
			
	void print(int i, String j){
		System.out.println("Print method with two parameter: " +i +" odd " +j);		
	}
	
	//Same method "print" now overloaded with String return type
	String print(String j){
		String text = j;
		return text;
	}
	

	public static void main(String[] args) {
		Overloadingex ol = new Overloadingex();
		ol.print(10);      //Method "print" is called with single parameter
		ol.print(20, 30);	//SAME Method name "print" is called with different i.e. two parameters
		ol.print(20, 30, 40);
		ol.print(40, "bucks");
		String textReturn = ol.print("Print method with string return type");
		System.out.println(textReturn);
	}

}
