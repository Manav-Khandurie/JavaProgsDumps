import java.util.*;
interface StackInterface
{
	void display();
    	void creation();
	int pop();
	void push(int element);
}
class StackClass implements StackInterface
{
	int arr[],top,size;
	StackClass(int value)
	{
		arr=new int[value];
		top=0;
		size=value;
	}
	public void push(int element)
	{
		if(top>=size)
		{
			System.out.println("StackOverFlow");
			System.exit(0);
		}else
		{
			arr[top++]=element;
		}
	}
	boolean empty()
	{
		if(top!=0)
		return true;
		else
		return false;
	}
	public int pop()
	{	
		if(empty())
		return arr[top];
		else
		{ System.out.println("StackUnderFlow");
    		   System.exit(0);
    		   return -999999;
    		  }
	}
	public void creation()
	{      
        	Scanner s=new Scanner(System.in);
            	int a=0;
		System.out.println("Enter values of stack , enter -99999 to stop:-");
		do{
		a=s.nextInt();
		this.push(a);
		top++;
		}while(a!=-99999);
	}
	public void display()
	{
		for(int i=0;i<size;i++)
		System.out.println(arr[i]);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter max size:-");
		int length=sc.nextInt();
		StackInterface obj=new StackClass(length);
		obj.creation();
		System.out.println("Enter:- \n 1 for push \n 2 for pop \n 3 for display");
		int num=sc.nextInt();
		switch(num)
		{
			case 1:
			System.out.println("Enter");
			int ele=sc.nextInt();
			obj.push(ele);
			break;
			case 2:
			int ans=obj.pop();
			System.out.println(ans);
			break;
			case 3:
			obj.display();
			break;
			default:
			System.out.println("Incorrect Input");
		}
	}
}