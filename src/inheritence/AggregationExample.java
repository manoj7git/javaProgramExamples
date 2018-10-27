package inheritence;

class Address {
	int FlatNum;
	String Area;
	String City;
	String State;
	Address(int FlatNum, String Area, String City, String State)
	{
		this.FlatNum = FlatNum;
		this.Area = Area;
		this.City = City;
		this.State = State;
	}
}
	
class Student{
	String Name;
	int RollNum;
	Address StudenAdress; ////Creating HAS-A relationship with Address class (Aggregation)
	
	Student(String Name, int RollNum, Address adr)
	{
		this.Name = Name;
		this.RollNum = RollNum;
		this.StudenAdress = adr;		
	}
	
	void StudentInfo()
	{
		System.out.println("Stu Name = " + Name + " Stu RollNum = " + RollNum + " StudenAdress: FlatNum = " + StudenAdress.FlatNum + " Area = " + StudenAdress.Area + " City = " + StudenAdress.City + " State = " + StudenAdress.State);
		/*System.out.println(RollNum);
		System.out.println(StudenAdress.FlatNum);
		System.out.println(StudenAdress.Area);
		System.out.println(StudenAdress.City);
		System.out.println(StudenAdress.State);	*/	
	}
	
	public static void main(String[] args){
		Address ad = new Address(306, "KPHB", "Hybd", "Telengana");
		Student stu = new Student("Manoj", 45, ad);
		stu.StudentInfo();
	}
}
