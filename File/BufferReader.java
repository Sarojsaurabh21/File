package File;

import java.io.FileWriter;
import java.io.IOException;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		
FileWriter fw=new FileWriter("D:/student.csv");// csv mean data showing in excel sheet save in bin file
fw.write("id,name,address");
fw.write("\n 1,ravi,address");
fw.write("\n2,karan,amumbi");
fw.write("\n3,names,adhytras");
fw.close();
	}

	public String readLine() {
		// TODO Auto-generated method stub
		return null;
	}

}
