package topic37_10aug_multithreading;

public class Mythread extends Thread{

	public void run() {
		System.out.println("I m thread 1");
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("Thread1:"+i);
			try {
				Thread.sleep(1000);//for how to run simultaneously 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
