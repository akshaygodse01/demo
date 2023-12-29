package topic27_20july_exception;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=null;
String name;
int roll;
float percentage;
Scanner in=new Scanner(System.in);
System.out.println("enter name:");
name=in.nextLine();
System.out.println("enter roll:");
roll=in.nextInt();

System.out.println("enter percentage:");
percentage=in.nextFloat();

try
{
	s=new Student(name,roll,percentage);
s.setRoll(0);//setter roll
}
catch(IllegalArgumentException e){
	System.out.println(e.getMessage());
}

System.out.println(s);
	}
	}


