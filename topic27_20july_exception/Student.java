package topic27_20july_exception;

public class Student {
	Student s;
	String name;
	int roll;
	float percentage;
	public Student(String name, int roll, float percentage) {
		super();
	
		this.name = name;
		
		if(roll<=0)
		{
			throw new IllegalArgumentException("roll cant be negative");
		}
		this.roll = roll;
		if(percentage<=0.0f)
		{
			throw new IllegalArgumentException("percentage no cant be negative");
		}
		this.percentage = percentage;
	}
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		//exception occour at cconstructor and setter 
				//therefore write 2 times
		 		if(roll<=0)
				{
					throw new IllegalArgumentException("roll no cant be zero");
				}
		this.roll = roll;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		if(percentage<=0.0f)
		{
			throw new IllegalArgumentException("percentage no cant be negative");
		}
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", percentage=" + percentage + "]";
	}

}
