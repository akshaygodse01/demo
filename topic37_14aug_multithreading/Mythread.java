package topic37_14aug_multithreading;

public class Mythread extends Thread {
private Counter counter;


public Mythread(Counter counter) {
	this.counter=counter;//constructor
	
}
public void run()
{
	for(int i=0;i<1000;i++)
	{
		this.counter.increment();
	}
}

}
