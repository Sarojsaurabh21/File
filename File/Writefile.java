package File;

import java.io.FileWriter;
import java.io.IOException;

public class Writefile {

	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("B.txt");// this file save in basic file
		
		fw.write("welcome to save");fw.close();
		System.out.println("created");

	}

}
