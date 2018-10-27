package programmingexamples;

public class RemoveJunkCharInString {

	public static void main(String[] args) {
		//How to remove Junk/Special Characters from a string?
		//Use replaceAll method with Regular expression: [^a-zA-Z0-9]
		
		String s = "!@#$ testing )(*&^ java";
		String s1 = "小米MIX 3 故宫特别版礼盒";
		
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(s1.replaceAll("[^a-zA-Z0-9]", ""));
	}

}
