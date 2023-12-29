package topic14_15june_inheritance;

public class Supercar extends Car {

int nitro;
Supercar(String model,int price,String colour,int nitro)
{//instead of writing car class details again we  call tostring+remaing extended class data
	super(model,price,colour);//call the constructor
	this.nitro=nitro;
	
	
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
	return super.toString()+"\nNitro:"+nitro;
		
	}
}
