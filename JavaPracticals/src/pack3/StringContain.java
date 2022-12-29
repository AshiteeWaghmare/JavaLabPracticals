package pack3;
import java.util.Scanner;
public class StringContain {

	public static void main(String[] args) {
		//Take input from user
		Scanner s=new Scanner (System.in);
		System.out.println("Enter your two Strings");
		
		String s1=s.nextLine();
		String s2=s.nextLine();
		//Compare String s1 and s2 using contain()
		//Print String exist if condition is true
		if(s1.contains(s2))
		{
			System.out.println("First String exists in Second String ");
		}
		//Print String doesn't exist if condition is false
		else
		{
			System.out.println("First String doesn't exist in Second String");
		}
	}

}
