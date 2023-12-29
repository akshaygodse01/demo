package topic9_8june_constructor;

public class Main {

	private String brand;
	private String colour;
	private int price;

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
smartphone s=new smartphone("apple","white",10000);
s.brand="samsung";
s.colour="white";
s.price=10000;

s.print();	}

}
