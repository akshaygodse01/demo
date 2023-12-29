package topic12_13june_settergetter;

public class Student {
	String name;
	int roll;
	Double percentage;
	
	Student(String name,int roll,double percentage)
	{
		this.name=name;
		this.roll=roll;
		this.percentage=percentage;
	}
	//setter
	public void setPercentage(Double percentage) {
		//validate data before we set it to our fields
		//percentage in between 0 to 100
		if(percentage>0 && percentage<=100)//positive value only print 
		this.percentage = percentage;//give access through class
	}
	
	//getter-used to get values
	double getpercentage()
	{
		return this.percentage;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name:"+this.name
				+"\nroll:"+this.roll
				+"\npercentage:"+this.percentage;
	}
}
