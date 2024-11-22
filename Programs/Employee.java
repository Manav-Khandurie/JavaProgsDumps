import java.util.*;
class Employee
{
	String name,id;
	double salary;
	Employee(String name,String id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	String name()
	{	return name;
	}
	double salary()
	{	return salary;
	}
	void Increasesalary(double salaryp)
	{
		this.salary*=salaryp;
	}
	void display()
	{
		System.out.print(name+"\t"+salary+"\t"+id);
	}
}
class Manager extends Employee
{
	String department;
	Manager(String name,String id,double salary,String department)
	{
		super(name,id,salary);
		this.department=department;
	}
	void display()
	{
        	super.display();
		System.out.print(department+"\t");
	}
}
class Organization extends Manager
{
        Organization(String name,String id,double salary,String department)
	{
		super(name,id,salary,department);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter :- \n");
		String name=sc.next();
		String id=sc.next();
		String department=sc.next();
		double salary=sc.nextDouble();
		Organization obj=new Organization(name,id,salary,department);
		obj.display();
		//Employee.obj.display();
	}
}