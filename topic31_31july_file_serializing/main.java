package topic31_31july_file_serializing;

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
Student one=new Student("akki",24, 85.40f);
FileOutputStream f=new FileOutputStream("C:\\Users\\Dell\\Documents\\filehandling.ser");
ObjectOutputStream oos=new ObjectOutputStream(f);
oos.writeObject(one);

oos.close();
f.close();
	}

}
