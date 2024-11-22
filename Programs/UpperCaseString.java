//String Handling
import java.util.*;
class UpperCaseString
{
	String str;
	Scanner sc=new Scanner(System.in);
	void perform()
	{
		str.trim();
		String s="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int value=(int)ch;
			if(value>=97 && value<=122)
			{
				s+=(char)(value-32);
			}else
				s+=(char)value;
		}str=s;
	}
	void input()
	{
		System.out.println("Enter the string :-");
		str=sc.nextLine();
	}
	void output()
	{
		System.out.println("The Output:--\t"+this.str);
	}
	public static void main(String args[])
	{
		UpperCaseString obj=new UpperCaseString();
		obj.input();
		obj.perform();
		obj.output();
	}//main
}//class