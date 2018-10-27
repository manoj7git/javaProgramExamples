package basics;

public class ConstructorEx1 {
	private String gf;
	//Constructor is created using the same class name & 
	//is used to initialize the variables as soon as the call object is initialized
	//=> Cannot used return type against constructor 
	public ConstructorEx1(String name){
		gf = name;
	}
	
	//Create a method to get the name
	public String getName(){
		return gf;
	}
	
	//Create a method to display name
	public void displayName() {
		System.out.println("Girlfred name is: " +getName());
	}

}
