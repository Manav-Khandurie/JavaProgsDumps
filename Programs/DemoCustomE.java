import java.util.*;
import java.io.*;
class DemoCustomE 
{
	int n;String message;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n and message:--");
		n=sc.nextInt();
		sc.next();
		message=sc.nextLine();
	}
	public static void main(String args[])
	{	
		DemoCustomE obj=new DemoCustomE();
		obj.input();
		System.out.println("OUTPUT:");
		try{
			if(obj.n<500)
			{
				throw new CustomException(obj.message);
			}
		}
		catch(CustomException E)
		{
			System.out.println(E);
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
		finally{
			System.out.println("ALL EXECUTED");
		}
	}
}