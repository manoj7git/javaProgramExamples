package basics;

public class wrapperclass {

	public static void main(String[] args) {
		
		//Autoboxing: converting the Primitive type int. variable to wrapper class
		int i = 100;
		//Integer iobj = Integer.valueOf(i);
		//System.out.println(iobj);
		Integer iobj = i; //This is Autoboxing where the compiler takes care of Integer class converting the Primitive type int. without the above step
		System.out.println(iobj);
		
		//Unboxing: converting wrapper class obj into primitive data type
		Integer iobj1 = new Integer(200);
		//int j = iobj1.intValue();
		//System.out.println(j);
		int j = iobj1; //This is Unboxing where the compiler takes care of Integer class converting into the Primitive type int. without the above step
		System.out.println(j);


	}

}
