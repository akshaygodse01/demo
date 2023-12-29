package topic14_19june_inheritance;


//superclass
class A{
	void process() {
		System.out.println("A process()");
	}
}

//sub class
class B extends A{
	@Override
	void process()
	{
		System.out.println("B process()");
	}
}
public class Superrefrence {

	public static void main(String[] args) {

		
		//super class ref with super class object
A a=new A();
a.process();

//sub class ref with sub class object
B b=new B();
b.process();

//super class refrence with sub class obj
A x=new B();
x.process();

	}

}
