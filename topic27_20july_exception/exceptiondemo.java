package topic27_20july_exception;

public class exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				int num;
				int[] ary= new int[10];
				try {
				num=10/10;
				ary[100]= 100;
				} catch (ArithmeticException e) {
				e.printStackTrace(); 
				System.out.println(e.getMessage());
				
				} catch (ArrayIndexOutOfBoundsException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}catch(Exception e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
	}
	}


