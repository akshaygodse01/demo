package topic30_26july_fileread;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Readdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	File f=new File("C:\\Users\\Dell\\Documents\\filehandling.txt");
	FileWriter fw=new FileWriter(f);
	Scanner in=new Scanner(System.in);
	String name=in.nextLine();
	String age=in.nextLine();Integer nage=Integer.valueOf(age);
	String salary=in.nextLine();Float fsalary=Float.valueOf(salary);
	String Company=in.nextLine();
	
	
	
	//or
//	String name=in.nextLine();
//	String age=in.nextLine();Integer nage=Integer.valueOf(age);
//	int a=Integer.parseInt(age);
//	String salary=in.nextLine();Float fsalary=Float.valueOf(salary);
//	int s=Float.parseFloat(salary);
//	String Company=in.nextLine();
	
	
	
	fw.write(name+","+age+","+salary+","+Company);
	fw.close();

	}
}