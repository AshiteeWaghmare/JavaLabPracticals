package pack3;
interface Printable
{	//Abstract method funct1() of Printable interface
	void funct1();
}
interface Calculate
{	//Abstract method funct2() of Printable interface
	int funct2(int i);
}
class CalSquare implements Printable, Calculate
{	//override method funct1()
	//print square of given number
	public void funct1()
	{	
		System.out.println("Square of a Number is =");
	}
	public int funct2(int a)
	{
		return a*a;
	}
}
class CalCube implements Printable,Calculate
{	//override method funct2()
	//print cube of given number
	public void funct1()
	{
		System.out.println("Cube of a Number is=");
	}
	public int funct2(int c)
	{
		return c*c*c;
	}
}

public class Calculation {
	
		public static void main(String[] args) {
			
			CalSquare c1=new CalSquare();
			c1.funct1();
			//passing value to the method
			System.out.println(c1.funct2(12));
			CalCube c2=new CalCube();
			c2.funct1();
			//passing value to the method
			System.out.println(c2.funct2(300));	
			
		}

}

