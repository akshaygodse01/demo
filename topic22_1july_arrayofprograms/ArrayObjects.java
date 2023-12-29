package topic22_1july_arrayofprograms;

import java.util.Scanner;

public class ArrayObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//array of primitive types
//int arr[]= {100,25,85,54,25
//	};
//System.out.println(arr.length);
	
		
//		Student s=new Student(10,"yash",92.7f);
//		System.out.println(s);
	
		//2
		
//		Student s[]=new Student[3];//new array create
//		
//		//create 3 new student objects
//		s[0]=new Student(5,"akshay",92.3f);
//		s[1]=new Student(6,"abhi",82.2f);
//		s[2]=new Student(7,"rushi",82.3f);
//		for(int i=0;i<s.length;i++)
//		{
//			System.out.println(s[i]);
//		}
	
	//get a data from user
		Scanner scan=new Scanner(System.in);
		System.out.println("how many students?");
		int count=scan.nextInt();
		Student s[]=new Student[count];
		for(int i=0;i<count;i++)
		{
			System.out.println("enter roll:");
			int r=scan.nextInt();
			System.out.println("enter name");
			String n=scan.next();
			System.out.println("enter marks");
			float m=scan.nextFloat();
			
			s[i]=new Student(r,n,m);
			 
			
			
		}
		System.out.println("report...");
		
		for(int i=0;i<count;i++)
		{
			System.out.println(s[i]);
	}
	}

}
