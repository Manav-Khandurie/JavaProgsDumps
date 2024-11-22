
import java.util.*;
class Numbers
{
	char characters[][]={{'a','b','c','\0'},{'d','e','f','\0'},{'g','h','i','\0'},{'j','k','l','\0'},{'m','n','o','\0'},{'p','q','r','s'},{'t','u','v','\0'},{'w','x','y','z'}};
	void perform(int a,int b)
	{
		a-=2;b-=2;//adjustment
		char array1[]=new char[4],array2[]=new char[4];
		for(int i=0;i<characters[a].length;i++)
			array1[i]=characters[a][i];
		for(int i=0;i<characters[b].length;i++)
			array2[i]=characters[b][i];
		for(int i=0;i<array1.length;i++)
		{	for(int j=0;j<array1.length;j++)
			{	if(array1[i]!='\0'&& array2[j]!='\0')
					System.out.print(array1[i]+""+array2[j]+" , ");
			}
		}
	}
	void perform(int a)
	{
		a-=2;//adjustment
		char array1[]=new char[4];
		for(int i=0;i<characters[a].length;i++)
			array1[i]=characters[a][i];
		for(int i=0;i<array1.length;i++)
		{	if(array1[i]!='\0')	
				System.out.print(array1[i]+" , ");
		}
	}
	void traversal(String s)
	{
		boolean check=false;
		for(int i=0;i<s.length()-1;i++)
		{	check=true;//more than one character
			for(int j=i+1;j<s.length();j++)
			{	
				perform(Integer.parseInt(Character.toString(s.charAt(i))),Integer.parseInt(Character.toString(s.charAt(j))));
			}
		}
		if(s.length()==0)
    		{
    		    System.out.println("[]");
                    System.exit(0);
                }
		if(!check)
		perform(Integer.parseInt(Character.toString(s.charAt(0))));
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter:-");
		String s=sc.nextLine();
		Numbers obj=new Numbers();
		System.out.println("All Possible combinations made are:-");
		obj.traversal(s.trim());
	}
}