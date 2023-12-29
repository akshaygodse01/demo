package topic33_03aug_arraylist;

import java.util.ArrayList;

import topic32_1aug_data_structure.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String>myList=new ArrayList<>();
//	
//		myList.add("Test");
//		myList.add("akki");
//		myList.add("dd");
//		boolean exixts=myList.contains("Test");
//		System.out.println(exixts);
		
		
		ArrayList<topic32_1aug_data_structure.Student>StudentList=new ArrayList<>();
//	StudentList.add(new Student("dny", 10));
//		StudentList.add(new Student("aks", 100));
//		StudentList.add(new Student("ddd", 1055));
//		boolean exixts=StudentList.contains("dny");
//		System.out.println(exixts);//false bcoz of before equals method.and not compare
//		
		
		StudentList.add(new Student("dny", 10));
		StudentList.add(new Student("aks", 100));
		StudentList.add(new Student("ddd", 1055));
		boolean exixts=StudentList.contains(new Student("dny", 10));//after implementation equalsmethod
		System.out.println(exixts);
		
	}

}
