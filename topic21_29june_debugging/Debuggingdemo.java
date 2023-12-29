package topic21_29june_debugging;
class DebugDemo{
	void process() {
		System.out.println("processing");
	}
	int add(int i,int j) {
		int res=i+j;
		return res;
	}
}
public class Debuggingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 DebugDemo dd=new DebugDemo();
    dd.process();
int r=dd.add(10, 200);
System.out.println(r);
	}

}
