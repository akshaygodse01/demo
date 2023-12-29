package topic34_07aug_Sorting_collection;


public class Student implements Comparable {
	private String name;
	private int roll;
	private float percent;
	
	



	public Student(String name, int roll, float percent) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.roll = roll;
		this.percent = percent;
	}




	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", percent=" + percent + "]";
	}




//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return this.roll-((Student)o).roll;
//	}




//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		Student temp=(Student) o;//typecast//object o
//		
//		if(this.roll<temp.roll)
//		return -1;//any negative value return in real life
//		
//		if(this.roll>temp.roll)
//			return 1;//any positive value
//		
//		if(this.roll==temp.roll)
//		return 0;//zero
//		return 0;
//	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return (int)(this.percent-((Student)o).percent);//subtract percentage and then return in int because we
		//dont make float method otherwise this is not override
	}



	
	
	}

