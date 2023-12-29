package topic33_02aug_arraylist;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>StringList=new ArrayList<>();//create array list
		
		System.out.println(StringList.size());
		StringList.add("akki");
		StringList.add("ak");
		StringList.add("abhi");
		StringList.add("arushi");
		//StringList.add(2);//because of you create arraylist of string
		
		System.out.println(StringList.size());
		System.out.println(StringList);
		StringList.add(1,"mahi");
		System.out.println(StringList);//add element and next move towards 
//		StringList.clear();
//		System.out.println(StringList.size());
//		System.out.println(StringList);
//		
		
		
		StringList.remove(1);//by index
		System.out.println(StringList);
		StringList.remove("abhi");//by name
		System.out.println(StringList);
		
		StringList.set(2, "null");
		System.out.println(StringList);
		
	}

}
