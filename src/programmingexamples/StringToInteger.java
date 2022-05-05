package programmingexamples;

public class StringToInteger {

	//Convert a String to Integer without using the Integer.parseint()
	
	public static void main(String[] args) {
		String test = "123";
		System.out.println(StrToInt(test));
		System.out.println(StrToInt(test)+10);

	}
	
	public static int StrToInt(String s) {
		int num=0;
		char[] chars = s.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			num = num*10 + ((int)s.charAt(i)-48); //substracting the ASCI value of 1 which is 48 from the corresponding Asci value of the string numericals.
		}
		return num;
		
	}

}
