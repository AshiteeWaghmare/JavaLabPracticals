/*program where you take input 2 numbers (i,j)from the user and divide the first number with second include exception handling mechanism*/
package pack3;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		int i,j;
		try
		{
			Scanner s=new Scanner(System.in); //taking input from the user
			System.out.println("Enter first value");
			
			i=s.nextInt(); //pass the first value
			System.out.println("Enter second value");
			
			j=s.nextInt();  //pass the second value
			System.out.println(i/j);   //print the calculation
		}
		catch(Exception e)
		{
			System.out.println(e);  //print exception
		}
			
	}

}



