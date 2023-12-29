package topic14_18june_inheritance;

public class Circle extends Shape {
	float radius;
	
	
	public Circle(){
		
	}
	
	public Circle(String colour,int width,float radius)
	{
		//option 1
//		this.colour=colour;
//		this.linewidth=width;
//		this.radius=radius;
//		
		//option 2 //access from super class
//		super.colour=colour;
//		super.linewidth=width;
//		this.radius=radius;
	
	
//option 3
		super(colour,width);
		this.radius=radius;}
	
	
	@Override//parent calss same method with same parameter 
	public void draw() {
		System.out.println("Drawing the circle with radius:"+this.radius);
	// super.draw();//optional for use for draw parent class
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "colour:"+colour
				+"linewidth:"+linewidth
				+"radius:"+this.radius;
	}

	
}
