package pack3;

import java.util.Scanner;

public class StringEqual {

	public static void main(String[] args) {
	
		Scanner s =new Scanner(System.in);
		//Take input from user
		System.out.println("Enter your two string");
			
		String s1=s.nextLine();
		String s2=s.nextLine();
		//Compare two Strings
		//String s1 is compare with String s2
		if(s1.equals(s2))
		{
			
			System.out.println("Both Strings are Equal");
		}
		//if above condition is false, it implies Strings are not equal
		else
		{
			System.out.println("Both Strings are not Equal");
		}

	}

}
