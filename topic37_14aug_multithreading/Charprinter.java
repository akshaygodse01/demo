package topic37_14aug_multithreading;

public class Charprinter extends Thread {
	public void run() {
		for(int i=65;i<100;i++)
		{
			System.out.println("character printer:"+(char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
