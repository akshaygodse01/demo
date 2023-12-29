package topic17_22june_interfaces;

public class Interfacedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle c=new Circle(); //object create
//c.draw();
	Triangle t=new Triangle();
	//t.draw();
	Rectangle r=new Rectangle();	
	drawshape(c);
	drawshape(t);
	drawshape(r);
	
	SavetomySQLDB(c);
	//SavetomySQLDB(t);//not create save to db because
//triangle not related to interface
//only circle implements savetodb	
	
	SavetomySQLDB(r);
	}
	
	//pass me any type of shape
	private static void drawshape(Shape s) {
		// TODO Auto-generated method stub
		s.draw();
	}
	
	//pass me any type of savetoDB
	public static void SavetomySQLDB(SavetoDB st)
	{
	st.save();	
	}

	

}
