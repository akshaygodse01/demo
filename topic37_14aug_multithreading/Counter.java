package topic37_14aug_multithreading;

public class Counter {
	private int count=0;
	int i;
	public synchronized void increment() //synchronied is used first to first method call then second
	{
	
		this.count +=1;
	}
	public int getcount() {
		return this.count;
	}

}
