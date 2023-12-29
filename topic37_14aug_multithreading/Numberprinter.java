package topic37_14aug_multithreading;

public class Numberprinter extends Thread {
public void run() {
	for(int i=0;i<100;i++)
	{
		System.out.println("Number printer:"+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
