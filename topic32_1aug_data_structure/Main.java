package topic32_1aug_data_structure;

public class Main {

	public static void main(String[] args) throws NullPointerException{
		// TODO Auto-generated method stub

		
		
		Stack mystack=new Stack(5);
		mystack.display();
		System.out.println(".......");
		mystack.push(12);
		mystack.push(23);
		mystack.display();
		System.out.println(".......");
		
		mystack.pop();
		mystack.display();
		
		System.out.println(".......");
	}

}
