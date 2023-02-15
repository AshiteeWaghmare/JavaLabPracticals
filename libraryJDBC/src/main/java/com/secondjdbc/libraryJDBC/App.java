package com.secondjdbc.libraryJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class App 
{
	static void insertion()
	   {
		 System.out.println("Insert your Data");  
	   
	    {
	      	try
	        	{
	        		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","admin");
	        	
	        		if(con.isClosed())
	        		{
	        			System.out.println("The connection is close");
	        		}
	        		else
	        		{
	        			System.out.println("The connection is Established");
	        			
	        			
	        		}
	        		//Creating the Insert Statement
	        		String q = "insert into libbooks (BookId,BookName,Prize) values(?,?,?)";
	        		PreparedStatement pstm = con.prepareCall(q);
	        		//Set the values for the query
	        		
	        		Scanner sc = new Scanner(System.in);
	        		System.out.println("Enter Book Id");
	        		int Book_id =sc.nextInt();
	        		pstm.setInt(1,Book_id);
	        		System.out.println("Enter Book Name");
	        		String Book_name =sc.next();
	        		pstm.setString(2,Book_name);
	        		System.out.println("Enter Book Prize");
	        		int Book_prize =sc.nextInt();
	        		pstm.setInt(3,Book_prize);
	        		
	        		//Executing the query
	        		pstm.executeUpdate();
	        		System.out.println("Inserted Successfully..!");
	        		//update the data in the database
	        	
	    }
		catch(Exception e)
		{
			System.out.println(e);
		}
	    
	    
	     }
	}
	   static void updation()
	   {
		 System.out.println("update data sucessfull");  
	   
	    {
	      	try
	        	{
	        		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","admin");
	        	
	        		if(con.isClosed())
	        		{
	        			System.out.println("The connection is close");
	        		}
	        		else
	        		{
	        			System.out.println("The connection is Established");
	        			
	        		}
	        		//Creating the Insert Statement
	        		String q = "update Books set BookName = ? , BookPrize = ? where BookId=?";
	        		
	    			PreparedStatement pt = con.prepareCall(q);
	    			
	    			Scanner sc = new Scanner(System.in);
	    			System.out.println("Enter Book Name That you Want to change :- ");
	    			String name = sc.next();
	    			System.out.println("Enter Book Prize That you want to change :- ");
	    			int prize = sc.nextInt();
	    			System.out.println("Enter Book Id where you want to change info :- ");
	    			int id = sc.nextInt();
	    			
	    			pt.setString(1,name);
	    			pt.setInt(2, prize);
	    			pt.setInt(3, id);
	    			
	    			pt.executeUpdate();
	    			System.out.println("The Data Is Updated Successfully....!");
	    		}
	    		catch(Exception e)
	    		{
	    			System.out.println(e);
	    		}
	    }
	  }
	   static void deletion()
	   {
		 System.out.println("delete data sucessfull");  
	   
	    {
	      	try
	        	{
	        		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","admin");
	        	
	        		if(con.isClosed())
	        		{
	        			System.out.println("The connection is close");
	        		}
	        		else
	        		{
	        			System.out.println("The connection is Established");
	        			
	        		}
	        		//Creating the Insert Statement
	        		String q = "delete from Books where Book_Id = ?";
	        		
	    			PreparedStatement pt = con.prepareCall(q);
	    			
	    			Scanner sc = new Scanner(System.in);
	    			System.out.println("Enter Book Id that you want to delete ");
	    			int id = sc.nextInt();
	    			
	    			pt.setInt(1, id);
	    			
	    			pt.executeUpdate();
	    			System.out.println("Deleted Successfully");
	    		}
	    		catch(Exception e)
	    		{
	    			System.out.println(e);
	    		}
	    	}
	   }
	   static void display()
	   {
		 System.out.println("display data sucessfull");  
	   
	    {
	      	try
	        	{
	        		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","admin");
	        	
	        		if(con.isClosed())
	        		{
	        			System.out.println("The connection is close");
	        		}
	        		else
	        		{
	        			System.out.println("The connection is Established");
	        			
	        		}
	        		//Select Statement
	            	String q = "select Book_Id,Book_Name,Book_Prize from Books";
	            	PreparedStatement pt = con.prepareStatement(q);
	            	ResultSet rset = pt.executeQuery();
	            	
	            	while(rset.next())
	            	{
	            		int id = rset.getInt(1);
	            		String name = rset.getString(2);
	            		int prize = rset.getInt(3);
	            	
	            		
	            		System.out.println("Book Id : "+id+" Book Name: "+name+" Book_Prize: "+prize);
	            	}
	            	
	            	//Closing the connection
	        		con.close();
	            }
	        	catch(Exception e)
	        	{
	        		System.out.println(e);
	        	}
	    	}
	   }
	   
	        		
	        		
	    static void opration()
	    {
		
		Scanner sc = new Scanner(System.in);
		int c;
		do 
		{
		System.out.println("Enter Your Choise:  1 :  Insertion, 2 : Updation, 3 : Deletion, 4 : Display ");
		c = sc.nextInt();
		
		switch(c)
		{
			case 1:  insertion();
			break;
			
			case 2: updation();
			break;
			
			case 3: deletion();
			break;
			
			case 4: display();
			break;
			
			default:System.out.println("Invalid Choice");
			break;
			
			
		}
		}while( c!=0);

	}     
	    
	   

	 public static void main( String[] args )
	{
		opration();
	    //System.out.println( "Hello World!" );
	}
}	

