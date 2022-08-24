package File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serillitionmain {

	public static void main(String[] args) throws IOException {
		Serillition s1=new Serillition(101,"saurabh",5000000);
		Serillition s2=new Serillition(102,"arunh",3000000);
		Serillition s3=new Serillition(103,"arbokeh",6000000);
		FileOutputStream fout=new FileOutputStream("output.txt"); 
		//FilterOutputStream fout=new FilterOutputStream("output.txt"); 
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.writeObject(s2);
		out.writeObject(s3);
		out.flush();
		out.close();
		System.out.println("serialization and Deserialization is been successfully executed");
		// TODO Auto-generated method stub

	}

}
