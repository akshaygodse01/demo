package topic10_9june_static;

public class Farmermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Farmer s=new Farmer("arya",10);
s.display();//constructor call

System.out.println(Farmer.count);

//static method can be directly called with class name
Farmer s1=new Farmer("neha",10);
s1.display();
System.out.println(Farmer.count);//call count from student

	
	//static method can be directly called with class name
Farmer.process();}

}
