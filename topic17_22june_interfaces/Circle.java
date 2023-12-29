 package topic17_22june_interfaces;

public class Circle implements Shape,SavetoDB{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw  a circle");
	}
	
	public void save()
	{
	System.out.println("saving the circle");	
	}
	

	
}
