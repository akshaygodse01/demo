package topic13_15june_containtment;

import java.util.Date;

public class Employee {
	String name;
	int id;
	Date doj;
	
	Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
		this.doj=new Date();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name:"+name
				+"\nid:"+this.id
				+"\ndate:"+this.doj;
	}

}
