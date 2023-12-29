package topic28_24july_filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f=new File("C:\\Users\\Dell\\Documents\\filehandling.txt ");
boolean status=f.exists();
System.out.println(status);

FileInputStream fin=new FileInputStream(f);

//only print 1 character
//int data=fin.read();
//System.out.println(data);
//fin.close();


//method1 loop
//while(fin.available()!=0)
//{
//int data=fin.read();
//System.out.printf("%c",(char)data);}
//fin.close();

//method 2 -array
//byte[] data=new byte[5];
//int read=fin.read(data);
//for(byte c:data) {
//System.out.printf("%c",c);
//}
//fin.close();


//read how much character and only print this
//byte[] data=new byte[5];
//int read=fin.read(data);
//
//int received=fin.read(data);
//
//for(byte c:data) {
//System.out.printf("%c",c);
//
//}
//System.out.println();
//System.out.println(received);
//fin.close();

//print a line

char data;
StringBuffer line=new StringBuffer() ;

do {
	data=(char)fin.read();
	line.append(data);
}while(data!='\n');//when we get a new line character then stop
System.out.println(line);

fin.close();
	}

}
