package topic26_12july_garbagecollector;


class Pen {
	
	void display() {
		System.out.println("This is a pen");
	}
}

public class GCDemo {

	public static void process() {
		
		Pen p = new Pen();
		p.display();
	}
	
	public static Pen processData() {
		
		Pen p = new Pen();
		return p;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
	//	process();
		Pen p2 = processData();
		p2.display();
		
		//p2 = null;
		
		//System.gc();
		
		System.out.println("Hey, hope you liked our program");
	}

}


