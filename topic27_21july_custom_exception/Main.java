package topic27_21july_custom_exception;

import java.util.Scanner;

public class Main {

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
	try {	
	s=new Student(name,roll,percentage);
	}
	catch(Invalidstudentparameterexception e) {
		System.out.println(e.getMessage());
	}
	System.out.println(s);
	}

}
