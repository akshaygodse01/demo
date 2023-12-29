package topic36_9aug_hashing;

import java.util.HashSet;

public class Student1 extends topic34_07aug_Sorting_collection.Student{
	

	public static <Student> void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Student>myset=new HashSet<>();
		myset.add(topic34_07aug_Sorting_collection.Student s2=new topic34_07aug_Sorting_collection.Student("akki",12,69.18f));
		myset.add(topic34_07aug_Sorting_collection.Student s1=new topic34_07aug_Sorting_collection.Student("akki g",22,79.18f));
		System.out.println(myset);
		
		boolean result=myset.contains("akki");
		System.out.println(result);
	}

}
