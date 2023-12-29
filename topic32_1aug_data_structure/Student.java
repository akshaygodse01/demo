package topic32_1aug_data_structure;

public class Student {
	private String name;
	private int roll;
	public Student(String name, int roll) {
	
		this.name = name;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
	@Override//overide method for equals in 3aug main program
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	Student arg=(Student) obj;
	if(this.roll==arg.roll&&this.name.equals(arg.name))
	{
		return true;
	}
	else
	{
		return false;
	}
	}
	
	
	
	

}
