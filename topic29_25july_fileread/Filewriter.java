package topic29_25july_fileread;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Dell\\Documents\\filehandling.txt");
	FileWriter fw=new FileWriter(f);
	Integer a=77;
	fw.write(a);//in ascii value 77
	fw.write("hello world");//string
	Float b=3.14f;
	fw.write(b.toString());
	fw.close();
	}
}
