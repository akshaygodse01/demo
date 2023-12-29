package topic22_1july_arrayofprograms;

public class Student {
int roll;
String name;
float marks;

public Student (int roll,String name,float marks) {
	this.roll=roll;
	this.name=name;
	this.marks=marks;
	
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "roll:"+roll+" name:"+name+" marks:"+marks;

}
}		