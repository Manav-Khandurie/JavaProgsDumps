//String Handling
import java.util.*;
class StringManupilation
{	String str;
        Scanner sc=new Scanner(System.in);
        StringManupilation()
        {
        }
        StringManupilation(String name)
        {
            str=name;
        }
	void perform()
	{	
	    System.out.println(" Character \'a\' is present @ :- ");
	    boolean flag=false;
	    for (int i=0;i<str.length();i++)
	    {
	        char ch=str.charAt(i);
	        if("a".equalsIgnoreCase(Character.toString(ch)))
	        {
	            flag=true;
	            System.out.print(i+",");
                }
            }System.out.println();
            if(flag== false)
            System.out.println("Not Found");
	}
	void length()
	{
    	     System.out.println("Length of String : "+str.length());
        }
	String input()
	{	System.out.println("Enter the string :-");
		String str=sc.nextLine();
		return str;
	}
	void output()
	{	System.out.println("The Output:--\n"+this.str);
	}
	public static void main(String args[])
	{	
	    StringManupilation obj=new StringManupilation((new StringManupilation()).input());//using Anonymous object
	    obj.length();
	    obj.perform();
	}//main
}//class
