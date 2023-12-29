package classprogram;

import java.util.Scanner;

public class Array_N_numberfromuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.out.println("how many number enter ");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	System.out.println("enter "+a +" numbers");
	int number[]=new int[a];
	for(int i=0;i<a;i++)
	{
		int number1=s.nextInt();
		System.out.println(""+number1);
		int j=0;
		if(a[j]>a[i])
		{
			System.out.println("maximum no is"+a[j]);
		}
	}
	}

}
