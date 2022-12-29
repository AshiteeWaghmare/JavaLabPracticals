package pack3;
import java.util.Scanner;
public class ReverseProg {

	public static void main(String[] args) {
		//Take input from user
		Scanner s =new Scanner(System.in);
		System.out.println("Enter your String");
	
		StringBuilder sb=new StringBuilder();
		sb.append(s.nextLine());
		//String is reverse using reverse()
		//print reverse String
		System.out.println(sb.reverse());
		String s1=sb.toString();
		//Print Uppercase String
		System.out.println("In UpperCase: "+s1.toUpperCase());

	}

}
