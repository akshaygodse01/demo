package topic19_28june_initialzerblocks;

public class InstanceInitializer {

	
String city;
String dept;
int pincode;
static int Count;
//default constructor 
public InstanceInitializer() {
	this.city="pune";
	this.dept="IT";
	this.pincode=413512;
}
//instance initializer block
{this.city="pune";
this.dept="IT";
this.pincode=413512;
System.out.println("instance initializer block calle d");
}

//static initializer block
static{
	Count=1;
	System.out.println("static initializer block");
}
//parameterised constructor
public InstanceInitializer(String city,String dept,int pincode){
	
		this.city=city;
		this.dept=dept;
		this.pincode=pincode;
	}

//parameterised constructor
public InstanceInitializer(String city,String dept){
this.city=city;
this.dept=dept;
this.pincode=413511;//default value set
}

//parameterised constructor
public InstanceInitializer(String city) 
	{this.city=city;
this.dept="IT"; //default value
this.pincode=413511; //default value
	
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "city : "+this.city+" dept: "+this.dept+" "
				+ "pincode: "+this.pincode;
}
}
	


