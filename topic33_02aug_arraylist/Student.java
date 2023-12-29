package topic33_02aug_arraylist;

import java.util.ArrayList;


public class Student{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<topic32_1aug_data_structure.Student>StudentList=new ArrayList<>();
		
		StudentList.add(new topic32_1aug_data_structure.Student("akki",10));
		
		
	StudentList.add(new topic32_1aug_data_structure.Student("gods",10));
	//StudentList.add(new Student("john",12);
		System.out.println(StudentList);
		System.out.println(StudentList.size());
		
		topic32_1aug_data_structure.Student temp=StudentList.get(1);
		System.out.println(temp);
	}

}
