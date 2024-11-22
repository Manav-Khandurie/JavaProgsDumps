class EThread3 extends Thread
{
        public void run()
        {
        
        }
	public static void main(String args[])
	{
		EThread3 t1=new EThread3();
		EThread3 t2=new EThread3();
		EThread3 t3=new EThread3();
		EThread3 t4=new EThread3();
		EThread3 t5=new EThread3();
		t1.setPriority(Thread.MAX_PRIORITY);  
		t2.setPriority(Thread.MAX_PRIORITY-1);
		System.out.println("t1 before starting thread isAlive: "+t1.isAlive()); 
		System.out.println("t2 before starting thread isAlive: "+t2.isAlive());  
		t1.start();t2.start();   
  		try{
			t1.sleep(1000);t2.sleep(900);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("t1 after starting thread isAlive: "+t1.isAlive()); 
		System.out.println("t2 after starting thread isAlive: "+t2.isAlive());
	}

}