package basics;

/*
 * Constructor is a block of code that initializes the newly created object.
 * Constructor has same name as the class 
 * The new keyword here creates the object of class MyClass and invokes the constructor to initialize this newly created object
 * There are three types of constructors: Default, No-arg constructor and Parameterized.
 * 
 *Every class has a constructor whether it’s a normal class or a abstract class.
 *Constructors are not methods and they don’t have any return type.
 *Constructor name should match with class name .
 *Constructor can use any access specifier, they can be declared as private also. Private constructors are possible in java but there scope is within the class only.
 *Like constructors method can also have name same as class name, but still they have return type, though which we can identify them that they are methods not constructors.
 *If you don’t implement any constructor within the class, compiler will do it for.
 *this() and super() should be the first statement in the constructor code. If you don’t mention them, compiler does it for you accordingly.
 *Constructor overloading is possible but overriding is not possible. Which means we can have overloaded constructor in our class but we can’t override a constructor.
 *Constructors can not be inherited.
 *If Super class doesn’t have a no-arg(default) constructor then compiler would not insert a default constructor in child class as it does in normal scenario.
 *Interfaces do not have constructors.
 *Abstract class can have constructor and it gets invoked when a class, which implements interface, is instantiated. (i.e. object creation of concrete class).
 *A constructor can also invoke another constructor of the same class – By using this(). If you want to invoke a parameterized constructor then do it like this: this(parameter list).

*****Difference between Constructor and Method******
The purpose of constructor is to initialize the object of a class while the purpose of a method is to perform a task by executing java code.
Constructors cannot be abstract, final, static and synchronised while methods can be.
Constructors do not have return types while methods do.

 * The use of super keyword
1) To access the data members of parent class when both parent and child class have member with same name
2) To explicitly call the no-arg and parameterized constructor of parent class
3) To access the method of parent class when child class has overridden that method.

Ref Link:
https://beginnersbook.com/2013/03/constructors-in-java/
https://beginnersbook.com/2014/07/super-keyword-in-java-with-example/
*
*/

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
