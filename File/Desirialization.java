package File;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

public class Desirialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//FileInputStream fin=new FileInputStream("out.txt");
		FileInputStream fin=new FileInputStream("out.txt");
		
		@SuppressWarnings("resource")
		ObjectInputStream in=new ObjectInputStream(fin);
		Serillition s1=(Serillition )in.readObject();
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getSalary());
		
		Serillition s2=(Serillition )in.readObject();
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		System.out.println(s2.getSalary());
		Serillition s3=(Serillition )in.readObject();
		System.out.println(s3.getId());
		System.out.println(s3.getName());
		System.out.println(s3.getSalary());
		System.out.println("=========================================================");
		
		
		
		
		
		
		
	}

}

