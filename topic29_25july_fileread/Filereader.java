package topic29_25july_fileread;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f=new File("C:\\Users\\Dell\\Documents\\filehandling.txt");
FileReader fr=new FileReader(f);
BufferedReader br=new BufferedReader(fr);
//read only single line
//String line=br.readLine();
//System.out.println(line);
//
//br.close();
//fr.close();


//2-to read all line
String line;
while((line=br.readLine())!=null)
{
	System.out.println(line);
}
br.close();
fr.close();}

}
