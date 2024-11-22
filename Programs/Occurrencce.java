//String Handling
import java.util.*;
class Occurrencce
{
	String str;
	Scanner sc=new Scanner(System.in);
	void checkfirst(String search)
	{
		int ans=str.indexOf(search);
		String w="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				w.trim();
				if(w.equalsIgnoreCase(search))
				System.out.println("The first occurrence of \""+search+"\" is @ : "+(i-w.length()-1));
				w="";
			}
			else
			w+=ch;
		}
	}
	void checklast(String search)
	{
		int ans=str.indexOf(search);
		String w="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				w.trim();
				if(w.equalsIgnoreCase(search))
				System.out.println("The last occurrence of \""+search+"\" is @ : "+(i-w.length()-1));
				w="";
			}
			else
			w+=ch;
		}
	}
	void choice()
	{
		System.out.println(" Enter :- \n 1: Search from first \n 2: Search from last");
		int choice=sc.nextInt();
    		sc.nextLine();//clears buffer
		System.out.println("Enter search value :-");
		String search=sc.nextLine();
		switch(choice)
		{
			case 1:
			checkfirst(search);
			break;
			case 2:
			checklast(search);
			break;
			default:
			System.out.println("Incorrect Input");
		}
	}
	void input()
	{
		System.out.println("Enter the string :-");
		str=sc.nextLine();
    		choice();
	}
	public static void main(String args[])
	{
		Occurrencce obj=new Occurrencce();
		obj.input();
	}//main
}//class