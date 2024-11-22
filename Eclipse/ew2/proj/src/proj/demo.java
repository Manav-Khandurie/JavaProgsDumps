package proj;
import java.util.*;
import java.io.*;
public class demo extends Thread
{
	static int amount;
	static Scanner sc=new Scanner(System.in);
	public void run()
	{
		
	}
	public static void main(String args[])
	{
		demo t1=new demo();
		demo t2=new demo();
		System.out.println("Enter amount");
		amount=sc.nextInt();
		t1.setName("A");
		t2.setName("B");
		
	}
}