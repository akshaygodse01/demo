package topic31_31july_file_serializing;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Fileinputstreamclose {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileWriter fw=new FileWriter("C:\\Users\\Dell\\Documents\\filehandling.txt");
BufferedWriter bw=new BufferedWriter(fw);

bw.write("this is a test");
bw.newLine();
bw.write("the second line");

bw.write("this is a test");
bw.newLine();
bw.write("the second line");
bw.write("this is a test");
bw.newLine();
bw.write("the second line");
bw.write("this is a test");
bw.newLine();
bw.write("the second line");

//must close file after otherwise not sure to right program properly
//bw.close();
//fw.close();
	}

}
