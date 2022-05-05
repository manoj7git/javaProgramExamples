package FileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingNotepad {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\manoj.ghadei\\Documents\\test.txt");
		f.createNewFile(); //Create a text file
		
		//Write to the Text file
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("This the 1st line");
		bw.newLine();
		bw.write("This is the 2nd line");
		bw.newLine();
		bw.write("Line 3");
		bw.newLine();
		bw.write("Line 4");
		bw.newLine();
		bw.write("Line 5");
		bw.newLine();
		bw.write("Line 6");
		//bw.flush();
		
		//Read from the text file
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		//Reading line by line
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		
		//Reading all lines at one go.
		String i = "";

		while ((i = br.readLine())!= null) {
			System.out.println(i);
		}

		
		
	}
	


}
