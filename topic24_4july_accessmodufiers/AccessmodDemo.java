package topic24_4july_accessmodufiers;

class A
{
	//private only used in class
	private int roll;
	void process() {
		System.out.println(roll);
		System.out.println("processing");
	}
}
//subclass
class B extends A
{
	void process();
	//this.roll;
}
public class AccessmodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A();
a.roll=10;
System.out.println(a.roll);
a.process();
	}

}
