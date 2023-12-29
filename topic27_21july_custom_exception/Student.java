package topic27_21july_custom_exception;


public class Student {
		Student s;
		String name;
		int roll;
		float percentage;
		public Student(String name, int roll, float percentage) throws Invalidstudentparameterexception{
			super();
		
			this.name = name;
			
			if(roll<=0)
			{
				throw new Invalidstudentparameterexception("roll cant be negative/negative");
			}
			this.roll = roll;
			
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
			
			this.roll = roll;
		}
		public float getPercentage() {
			return percentage;
		}
		public void setPercentage(float percentage) {
			this.percentage = percentage;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", roll=" + roll + ", percentage=" + percentage + "]";
		}
	}
	


