package proj;
import java.util.Scanner;

class Rectangle implements computearea
{
	float len,bre;
	Rectangle(float len,float bre)
	{
		this.len=len;this.bre=bre;
	}
	public void area()
	{
		System.out.println("Area of Rectangle:-\t"+(len*bre));
	}	
}
class Circle implements computearea
{
	float radius;
	Circle(float radius)
	{
		this.radius=radius;
	}
	public void area()
	{	//pi=0
		System.out.println("Area of Circle:-\t"+(PI*Math.pow(radius,2)));
	}
}
class Square implements computearea
{
	float side;
	Square(float side)
	{
		this.side=side;
	}
	public void area()
	{	System.out.println("Area of Square:-\t"+(Math.pow(side,2)));
	}
}
public class AreaComputation
{	
public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter:-");
		computearea obj;
		System.out.println("Enter:- \n 1 for Rectangle \n 2 for Circle \n 3 for Square");
		int num=sc.nextInt();
		switch(num)
		{
			case 1:
			System.out.println("Enter");
			float len=sc.nextFloat();
			float bre=sc.nextFloat();
			obj=new Rectangle(len,bre);
			obj.area();
			break;
			case 2:
			System.out.println("Enter");
			float radius=sc.nextFloat();
			obj=new Circle(radius);
			obj.area();
			break;
			case 3:
			System.out.println("Enter");
			float side=sc.nextFloat();
			obj=new Square(side);
			obj.area();
			break;
			default:
			System.out.println("Incorrect Input");
		}
	}//main
}//class
