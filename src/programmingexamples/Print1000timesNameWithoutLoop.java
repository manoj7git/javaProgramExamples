package programmingexamples;

public class Print1000timesNameWithoutLoop {
	//Print your name 1000 times without any loop.

	public static void main(String[] args) {		
		
		String i = "i";
		
		 i = i.replaceAll("i", "iiiiiiiiii");
		 i = i.replaceAll("i", "iiiiiiiiii");
		 i = i.replaceAll("i", "iiiiiiiiii");
		
		System.out.println(i.replaceAll("i", "Manoj" + "\n"));

	}

}
