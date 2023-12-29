package string_04_june;

import java.util.Scanner;

public class String_character_presentornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a sentence ");
		Scanner b=new Scanner(System.in);
		String a=b.nextLine();
		System.out.println(""+a);
		System.out.println(a.contains("morning"));
	}

}
