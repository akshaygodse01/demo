package classprogram;

import java.util.Scanner;

public class ASSIGN2ADDITION {

	public static void main(String[] args) {
		
// TODO Auto-generated method stub
		int sum=0;
for(int i=0;i<3;i++)
{
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();

	 sum=sum+a;
	}
System.out.println("sum is "+sum);
	}

}
