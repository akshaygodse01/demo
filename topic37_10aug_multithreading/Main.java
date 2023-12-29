package topic37_10aug_multithreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Mythread m1=new Mythread();
Mythread2 m2=new Mythread2();
System.out.println("this is a test");
//m1.run();//sequential execution
//m2.run();
m1.start();//not for next call//not stop//both thread simultaneously run
m2.start();

System.out.println("main is doing here");
	}

}
