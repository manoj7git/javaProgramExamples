package inheritence;

class BaseClass {
	int num;
	
	//Parent class non-parameterized constructor
	/*BaseClass()
	{
		this.num = 10;
		System.out.println(num);
		System.out.println("Base class constructor w/o parameter invoked");
	}*/
	
	//Parent class parameterized constructor
	BaseClass(int i)
	{
		this.num = i;
		System.out.println(i);
		System.out.println("Base class constructor with parameter invoked");
	}
	
	//Parent class method
	void dis()
	{
		System.out.println("method of base class");
	}

}

class childclass extends BaseClass{
	//child class constructor with parameter
	childclass(int j)
	{
		super(11); 		// 1st the B. Class parameterized constructor is invoked
		System.out.println(j);
		System.out.println("child class constructor invoked");		
	}
	
	//child class method same as B. Cals with same name
	void dis()
	{
		System.out.println("method of child class");
		super.dis(); //Overrides the BASE class method and appears based on the order of step.
	}
	
	public static void main(String[] args){
		childclass cclass= new childclass(12);		
		cclass.dis();		
	}
}
