package basics;

public class eNum {
	
	enum days {Monday, Tuesday, Wednesday, 
		Thursday, Friday, Saturday, Sunday};
		
	void display() {
		
		for(days day : days.values()) {
			
			System.out.println("Enum Value : " + day);
		}
	}

	public static void main(String[] args) {
		eNum obj = new eNum();
		obj.display();

	}

}
