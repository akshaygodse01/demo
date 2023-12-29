package topic10_9june_static;

public class Farmer {
	//static field
	String name;
	int roll;
	//static field
	static int count;//common for all object
	
	Farmer(String name,int roll)
	{this.name=name;
	this.roll=roll;
	Farmer.count++;//ststic field to be accessed by static way(class name)
	}
	
	//non static method 
	void display()
	{
		System.out.println(""+name+","+roll);
	}
 //static method
	static void process()
	{System.out.println("processing...");
	}
}
