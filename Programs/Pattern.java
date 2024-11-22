//print pattern
import java.lang.*;
class Pattern
{
	void display()
	{
		for(int i=1;i<=5;i+=2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Pattern obj=new Pattern();
		obj.display();
	}//main
}//class