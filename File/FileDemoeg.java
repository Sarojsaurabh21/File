package File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemoeg {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fout=new FileOutputStream("D:/A.text"); 
		String s="hello";
		byte b[]=s.getBytes();
		try {
			fout.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("created");
	}

}
