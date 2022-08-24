package File;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runtimeinputs {

	public static void main(String[] args) throws NumberFormatException, IOException {//we can run time value add aas well as printl the data
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//this is Runtime Bufferreader
		System.out.println("Enter tha id");
		int id=Integer.parseInt(br.readLine());
		System.out.println("enter name");
		String name=br.readLine();
		System.out.println("Enter salary");
		float salary=Float.parseFloat(br.readLine());
		System.out.println(id);
		System.out.println(salary);
		System.out.println(name);
		
	}

}

