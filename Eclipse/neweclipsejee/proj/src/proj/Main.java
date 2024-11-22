package proj;

public class Main extends Thread {
	public void run()
	{
		System.out.println(currentThread().getName());
	}
	public static void main(String args[])
	{
		Thread obj=new Thread("First");
		obj.setName("FirstThread");
		obj.start();
		System.out.println("done with main");
	}
}
