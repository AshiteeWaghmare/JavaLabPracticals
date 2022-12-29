/*Write a program take a input of  age from the user if the age is above 18 print "you are eligible 
to  vote  else throw an exception that 'age is not correct.'*/
package pack3;
import java.util.Scanner;
public class ExceptionVoteEx 
 {

	public static void main(String[] args) {
		int age ;
		
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter your age");
	    
	    age=s.nextInt();//taking input from user
	    try 
	    {
	    	//print eligible if condition is true
	    	if(age>=18)
	    	{
		    System.out.println("You are eligible to vote");
	    	}
	    	//print not eligible if condition is false
		    else 
	    	{	
		    	//print incorrect age using throw 
	    		throw new Exception("Age is not correct");

	    	}
	    }
	    catch(Exception e)
	    {
	    	//throw exception
	    	System.out.println(e);
	    }
 
	}
 }
