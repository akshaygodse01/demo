package topic36_9aug_hashing;

import java.util.HashSet;

import topic34_07aug_Sorting_collection.Student;

public class Studentmain extends Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student("akki",12,55.60f);
		Student s2=new Student("akki",12,55.60f);
		System.out.println(s1.hashCode());	
		System.out.println(s2.hashCode());//hashcode to determine both student same or not
		HashSet<Student>myset=new HashSet<>();
		myset.add(s1);
		myset.add(s2);
		
		System.out.println(s1.equals(s2));
		System.out.println(myset);
		}

}
