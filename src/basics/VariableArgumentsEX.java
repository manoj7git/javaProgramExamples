package basics;

//=> Var-Arg is a way of overloading same method with declaring a same type of variable parameter.
//- The method is declared like: method(int...x) or method(String name) or method(double...x) or method(String name, int...x) etc...

public class VariableArgumentsEX {
	int add = 0;
	void m1(int...i){
		for (int j : i) {			
			add=add+j;
		}
		System.out.println(add);		
	}
	
	void m2(String name, int...i){
		for (int j : i) {			
			add=add+j;
		}
		System.out.println("My name is: " +name);
		System.out.println(add);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableArgumentsEX va = new VariableArgumentsEX();
		va.m1(10);
		va.m1(10, 15);
		va.m2("Manoj", 15, 15);
	}

}
