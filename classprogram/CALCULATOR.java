package classprogram;

import java.util.Scanner;

public class CALCULATOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter 1 for addition ");
System.out.println("enter 2 for substraction ");
System.out.println("enter 3 for multiplication ");
System.out.println("enter 4 for division ");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println(" "+a);

System.out.println("enter first number ");
Scanner y=new Scanner(System.in);
int c=y.nextInt();
System.out.println(" "+c);
System.out.println("enter second number ");
Scanner z=new Scanner(System.in);
int d=z.nextInt();
System.out.println(""+d);

switch(a){

case 1:
	System.out.println("addition is"+(c+d));
	break;
case 2:
	System.out.println("substraction is"+(c-d));
	break;
case 3:
	System.out.println("multiplication is"+(c*d));
	break;
case 4:
	System.out.println("division is"+(c/d));
	break;
}
		
}
	

}
