package topic14_15june_inheritance;

public class Car {
	String model;
	int price;
	String colour;
	
	Car(String model,int price,String colour)
	{
		this.model=model;
		this.price=price;
		this.colour=colour;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "model :"+this.model
				+"\nprice:"+this.price
				+"\ncolour:"+this.colour;
	}
}
