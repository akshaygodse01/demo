package topic34_07aug_Sorting_collection;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Student>mylist=new LinkedList<>();
		
		mylist.add(new Student("AKKI",18,(float) 69.10));
		mylist.add(new Student("rushi",19,(float) 89.10));
		mylist.add(new Student("abhi",17,(float) 59.10));
		mylist.add(new Student("dd",15,(float) 67.10));
		System.out.println(mylist);
		
		
//		Student a=new Student("AKKI",18,(float) 69.10);
//		Student b=new Student("AKKI",18,(float) 89.10);
//		a.compareTo(b);
//		int result=a.compareTo(b);
//		System.out.println(result);
		
		Collections.sort(mylist);//sort collection
		System.out.println(mylist);
	}

}
