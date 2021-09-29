package FileOperations;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		
		try {
			//Path to create Directory
			String path1 = "C:\\Users\\Administrator\\Documents\\myFold";
			
			//Path to create Multiple Directories
			String path2 = "C:\\Users\\Administrator\\Documents\\Dir1\\Dir2";
			
			// Create one directory
			File f = new File(path1);
			
			if (!f.exists()) {
				if (f.mkdir()) {
					System.out.println("Directory: "+path1+" created");
				}
				
			}
			
			// Create multiple directories
			File fs = new File(path2);
			
			if (!fs.exists()) {
				if (fs.mkdirs()) {
					System.out.println("Directories: "+path2+" created");
				}
				
			}
			
		} catch (Exception e) {
			System.err.println("Error : " + e.getMessage());
		}		

	}

}
