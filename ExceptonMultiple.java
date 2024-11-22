import java.util.*;
import java.io.*;
class ExceptonMultiple
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
    		System.out.println("INPUT:-");
		try{
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("OUTPUT:-");
			System.out.println(a/b);
		}
		catch (InputMismatchException E)
		{
			System.out.println(E);
		}
		catch (ArithmeticException E)
		{
			System.out.println(E);
		}
		catch (Exception E)
		{
			System.out.println(E);
		}
		finally{
			System.out.println("ALL EXECUTED");
		}
	}
}