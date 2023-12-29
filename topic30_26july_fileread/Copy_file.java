package topic30_26july_fileread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Copy_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.println("entter source file name");
		String sourceoffile=in.nextLine();
		
		System.out.println("entter target file name");
		String targetfile=in.nextLine();
		
		File input=new File(sourceoffile);
		
	File output=new File(targetfile);
//1-read character by character		
//		FileReader fr=new FileReader(input);
//		FileWriter fw=new FileWriter(output);
		
	//read byte by byte
		FileInputStream fr=new FileInputStream(input);
		FileOutputStream fw=new FileOutputStream(output);
		
		
	int data=fr.read();
	while(data!=-1) {
		fw.write(data);
	}fr.close();
	fr.close();
	}

}
