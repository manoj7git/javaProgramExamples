package basics;

class parent{
	int i = 10;
	//parent constructor
	parent(){
		System.out.println("Parent constructor");
	}
	//Parent method
	void parentmethod(){
		System.out.println("Super class method called using Super keyword");
	}
	
}
class child1 extends parent{
	int i= 20; //int i overridden in child class
	
	//Child1 constructor created
	child1(){
		System.out.println("Child1 constructor called along with above super class i.e. parent class constructor");
	}
	//Child1 method
	void child1method(){
		System.out.println("Child-1 method called");		
	}	
}
class child2 extends child1{
	int i= 30; //int i overridden in child class2
	
	//=> Super constructor super() is used to call all the parent class constructors in the child class constructor.
	//-Even if its not defined in the child class constructor, all the parent class constructors(multilevel inheritence case) gets called by default
	//- super()is used to be called 1st inside a child class constructor else error will be thrown if defined after some statements
	//Child2 constructor created
	child2(){
		//super(); //=> used to call all the parent class constructors in this child class constructor; 
				   //without mentioning also all the parent class constructors gets called by default
		System.out.println("Child2 constructor called along with above parent class constructors");
	}
		
	//Child2 method
	void child2method(){ 
		System.out.println("Child-2 method called");
		//Calling of immediate parent class method(Child1 method in this cases) using Super keyword
		super.child1method();//=>Super class method called using Super keyword
		
		System.out.println("Integer of immediate parent class variable is called using super keyword: " +i); //This will just print the overridden variable of child 2 class
		System.out.println("Integer of immediate parent class variable is called using super keyword: " +super.i); //=> This will print the i value of immediate parent class (Child 1 in this case) using super keyword
	}
}


public class SuperKeywordex {

	public static void main(String[] args) {
		child1 c1 = new child1();
		child2 c2 = new child2();
		
		//c1.child1method();
		c2.child2method();

	}

}
