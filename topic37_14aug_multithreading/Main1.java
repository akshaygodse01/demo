package topic37_14aug_multithreading;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is a test");
		Counter c1=new Counter();
		Mythread t1=new Mythread(c1);
		Mythread t2=new Mythread(c1);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("count:"+c1.getcount());
		System.out.println("main is done here....");
	}

}
