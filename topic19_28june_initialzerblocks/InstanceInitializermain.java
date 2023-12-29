package topic19_28june_initialzerblocks;

public class InstanceInitializermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InstanceInitializer a=new InstanceInitializer();
InstanceInitializer b=new InstanceInitializer("pune","it",413511);
InstanceInitializer c=new InstanceInitializer("pune","it");
InstanceInitializer d=new InstanceInitializer("pune");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(InstanceInitializer.Count);
	
	}

}
