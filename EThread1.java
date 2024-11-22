class EThread1 extends Thread
{
	public void run()
	{
		if((Integer.parseInt(currentThread().getName()))%2==0)
		{for(int i=0;i<5;i++)
		{
			try{
			Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.print(i+"\t");
		    }System.out.println();
		}
		else
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
		    	}System.out.println();
		}
		}
	}

class Threadex1 
{
	public static void main(String args[])
	{
		EThread1 t1=new EThread1();
		EThread1 t2=new EThread1();
		t1.start();
		t2.start();
		t1.setName("1");
		t2.setName("2");		
	}

}
