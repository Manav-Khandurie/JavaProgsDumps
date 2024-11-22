class Threadex extends Thread
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
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		Threadex t1=new Threadex();
		Threadex t2=new Threadex();
		t1.start();
		t2.start();
	}
}