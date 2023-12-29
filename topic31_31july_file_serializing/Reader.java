package topic31_31july_file_serializing;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reader {

	public static void main(String[] args)throws IOException,FileNotFoundException, ClassNotFoundException {
		// TODO Auto-generated method stu
		
Student temp=null;
FileInputStream fo=new FileInputStream("C:\\Users\\Dell\\Documents\\filehandling.ser");
ObjectInputStream ois=new ObjectInputStream(fo);

temp=(Student) ois.readObject();//read object
System.out.println(temp);
ois.close();fo.close();

	}

}
