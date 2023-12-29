package topic31_31july_file_serializing;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private int age;
	private float percent;
	public Student(String name, int age, float percent) {
	
		this.name = name;
		this.age = age;
		this.percent = percent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	
	
	

}
