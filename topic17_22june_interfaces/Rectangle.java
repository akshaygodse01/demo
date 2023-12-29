package topic17_22june_interfaces;

public class Rectangle implements SavetoDB, Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
System.out.println("savinga rectangle"); 
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
System.out.println("draw the rectangle");
	}

}
