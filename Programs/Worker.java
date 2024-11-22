//Use polymorphism to calculate the salary
import java.util.*;
class Worker
{
	String name;
	double salaryrate;
	Worker(String name,double salaryrate)
	{
		this.name=name;
		this.salaryrate=salaryrate;
	}
	
}//Worker
class DailyWorker extends Worker
{
        DailyWorker(String name,double salaryrate)
        {
                super(name,salaryrate);
        }
	int ComPay(int hours)
	{
		return (int)super.salaryrate*hours;	
	}
}//DailyWorker
class SalariedWorker extends DailyWorker
{
	SalariedWorker(String name,double salaryrate)
	{
		super(name,salaryrate);
	}
	int ComPay(int hours)
	{
		return (int)super.salaryrate*(hours/40); 
	}
	void calc(int hours)
	{
        	int ans=0;
		switch(hours)
		{
			case 1:
				ans=ComPay(hours);
				System.out.println("The salary will be :-"+ans);
				break;
			case 2:
				ans=super.ComPay(hours);
				System.out.println("The salary will be :-"+ans);
				break;
			default:
				System.out.println("Wrong input");
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Name and salary rate");
		String name=sc.nextLine();
		double salaryrate=sc.nextDouble();
		SalariedWorker obj=new SalariedWorker(name,salaryrate);
		System.out.println("Enter \n 1-DailyWorker \n 2-SalariedWorker");
		int choice=sc.nextInt();
		System.out.println("Enter Hours of work done");
		int hours=sc.nextInt();
		obj.calc(hours);
	}//main
}//SalariedWorker