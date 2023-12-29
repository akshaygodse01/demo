package topic37_14aug_multithreading;

public class Main {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
System.out.println("this is a test");
Numberprinter np=new Numberprinter();
Charprinter cp=new Charprinter();
np.start();
cp.start();

cp.join();
np.join();//unless and until charprinter ends next main method not execute
System.out.println("main is done here....");

	}

}
