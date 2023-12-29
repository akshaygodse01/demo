package topic33_03aug_arraylist;

import java.util.Date;

import topic32_1aug_data_structure.Student;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="test";
String b="test";
if(a==b)
{
	System.out.println("same");
}
else
{
	System.out.println("different");
}

Date d1=new Date(23,7,3);
System.out.println(d1);

Date d2=new Date(23,7,3);
System.out.println(d2);
if(d1==d2)//check refrences
{
	System.out.println("same");
}
else
{
	System.out.println("different");
}


System.out.println(d1.equals(d2));//equals method check values	


Student s1=new Student("akki", 10);
Student s2=new Student("akki",10);

System.out.println(s1.equals(s2));// writ implementhod in 1aug student program


}

}
