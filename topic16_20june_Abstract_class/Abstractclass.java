package topic16_20june_Abstract_class;

abstract class vehicle{
	int chasis;
	int Fuelcapacity;
	int Enginecc;
	String colour;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	
}
public void start()
{
	System.out.println("start a vehicle....");}
}

 //methods


class Bus extends vehicle{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "bus: "+this.getColour();
	}
		public void start()
		{
			System.out.println("start a bus....");}
	//declaration	
	//abstract public void start();
	
}

class Truck extends vehicle{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Truck: "+this.getColour();
	}
		public void start()
		{
			System.out.println("start a truck....");}
		
}
class Car extends vehicle{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car:"+this.getColour();
	}

	
}



public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bus b=new Bus();//create a bus 
b.setColour("black");
Truck t=new Truck();
t.setColour("red");

Car c=new Car();
c.setColour("orange");

//vehicle v=new vehicle();//abstract class cannot create
System.out.println(b);

System.out.println(t);
System.out.println(c);
	b.start();
	t.start();
	c.start();
	}

}
