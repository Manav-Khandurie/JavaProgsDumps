import java.util.*;
import java.io.*;
public class CustomException extends Exception
{
	//public String message;
	CustomException(String str)
	{
		super(str);
	}
	/**public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter custom message:--");
		message=sc.nextLine();
	}**/
}