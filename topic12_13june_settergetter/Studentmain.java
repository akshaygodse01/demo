package topic12_13june_settergetter;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated me,thod stub
Student s=new Student("akshay",18,85.40);
System.out.println(s);
	
	s.setPercentage(90.35);
	System.out.println(s.getpercentage());//to get only percentage
	}

}
