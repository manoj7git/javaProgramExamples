package basics;

class runtime1{
	int i= 10;
	void m1(){
		System.out.println("Parent class");
	}
}

class runtime2 extends runtime1{
	int i= 20;
	void m1(){
		System.out.println("Child class-1 method overridden");
	}	
}
class runtime3 extends runtime2{
	int i= 20;
	void m1(){
		System.out.println("Child class-2 method overridden");
	}
}

public class DynamicRuntimeDespatchex {

	public static void main(String[] args) {
		// Dynamic Method Despatch/Runtime Polymorphism: is a process where the overridden method is
		// resolved during runtime instead of compile time.
		//=> The overridden method is called through reference variable (instance variable)  of the parent/Super class
		runtime1 A = new runtime1();
		runtime1 B = new runtime2(); 
		runtime1 C = new runtime3(); 
		A.m1();
		B.m1(); //Child class1 method m1 now overrides parent class method m1
		C.m1();	//Child class2 method m1 now overrides parent class method m1	
		
		//=> Runtime Polymorphism is applied only to methods but not to the 
		//class variables (i.e. class variables cann't be overridden using DMD/RP)
		System.out.println(A.i);
		System.out.println(B.i); //Trying to override Superclass attribute(variable i), but still the o/p refers to the Parent class attribute value
		System.out.println(C.i); //Trying to override Superclass attribute(variable i), but still the o/p refers to the Parent class attribute value

	}

}
