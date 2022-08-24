package File;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentFileReader {
//	private static final String Add

	public void read() throws IOException
	{
		ArrayList<Student>list=new ArrayList<Student>();
		FileReader f=new FileReader("D:/student.csv");
		
		try (BufferedReader br = new BufferedReader(f)) {
			br.readLine();
			String row=br.readLine();
			String col=br.readLine();
			while(row!=null)
			{
				Student stu=createStudent(row);
				list.add(stu);
				row=br.readLine();
				col=br.readLine();
			}
		}
		System.out.println("print");
		for(Student s:list)
		{
			System.out.println(s);
		}
		
		
	}

	private Student createStudent(String row) {
		String data[]=row.split(",");
		int id=Integer.parseInt(data[0]);
		String name=data[1];
		String Address=data[2];
		Student stu=new Student(id,name,Address);
		
		// TODO Auto-generated method stub
		return stu;
	}

}

