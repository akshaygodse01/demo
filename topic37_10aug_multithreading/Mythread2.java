package topic37_10aug_multithreading;

public class Mythread2 extends Thread {
	public void run() {
		System.out.println("I m thread 2");
	int i;
	for(i=0;i<5;i++)
	{
		System.out.println("Thread2:"+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
