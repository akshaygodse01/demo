package topic11_12june_tostring;

public class Book {
	String name;
	int price;
	Book(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Book name:" +this.name
			+"\nBook price:" +this.price;

}
}
