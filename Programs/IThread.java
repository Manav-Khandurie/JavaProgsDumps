class IThread implements Runnable
{
	public void run()
	{
		for(int i=5;i<10;i++)
		{
			try{
			Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.print(i+"\t");
		}
	}
}
class EThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try{
			Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.print(i+"\t");
		}
	}
}
class Threadex 
{
	public static void main(String args[])
	{
		EThread t1=new EThread();
		EThread t2=new EThread();
		t1.start();
		t2.start();
		Thread t3=new Thread(new IThread());
		t3.start();		
	}

}
