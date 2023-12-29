package topic20_29june_finalkeyword;

class A{
	void process() {
		System.out.println("Processing...");
	}
	void print() {
		System.out.println("printing...");
	}
}
class B extends A{
	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("B-printing...");
	}
}
public class Finaldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//variable refrence
		final int a=10;
		System.out.println(a);
	//	a++;
		System.out.println(a);
		
		//method
		A b=new A();
		b.process();
		b.print();
	}

}
