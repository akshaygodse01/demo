package topic14_18june_inheritance;

public class Shape {
	String colour;
	int linewidth;
	
	Shape()//constructor initialization//
	//parameter not passed //default value set 
	{
		colour="black";
		linewidth=1;
	}
	//alrady constructor parent written
	//
	Shape(String colour,int linewidth)
	{
		this.colour=colour;
		this.linewidth=1;
		
	}
	public void draw()
	{
		System.out.println("Shape-draw()");
	}
	

}
