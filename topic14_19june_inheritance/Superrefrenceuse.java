package topic14_19june_inheritance;

class Vehicle{
	void start() {
		System.out.println("vehicle stsrt()...");
	}
}
class Bus extends Vehicle{
void start() {
	System.out.println("Bus start()...");
}
}


class Truck extends Vehicle{
void start() {
	System.out.println("Truck start()...");
}}
public class Superrefrenceuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehicle v1=new Vehicle();
Bus v2=new Bus();
Truck v3=new Truck();
	startvehicle(v3);
	startvehicle(v2);
	
	}
	public static void startvehicle(Vehicle x) {
		x.start();
	}
 
}

