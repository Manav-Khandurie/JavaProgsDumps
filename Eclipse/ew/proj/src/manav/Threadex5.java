package manav;
//showing deadlock
import java.util.*;
public class Threadex5 extends Thread implements Runnable
{
    static String a="a",b="b";
    public  synchronized void runningThreadA() throws InterruptedException {
    	wait(50);
    	synchronized(a)
		{	System.out.println("Thread a: locked resource 1"); 
			System.out.println("Thread a wants resource 2");
			synchronized(b)
			{	
				System.out.println("Thread a: locked resource 2"); 
				System.out.println("Done with Thread a");
				notifyAll();
			}
        }
    }
    public  synchronized void runningThreadB() throws InterruptedException {
    	
    	synchronized(b)
		{	System.out.println("Thread b: locked resource 2"); 
			System.out.println("Thread b wants resource 1");
			synchronized(a)
			{			
				System.out.println("Thread b: locked resource 1");
				System.out.println("Done with thread b");
				notifyAll();
			}
        }
    }
    public void run()
    {
        if((Thread.currentThread().getName()).equals("a"))
        {
			try {
				runningThreadA();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
        else
        {
			try {
				runningThreadB();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
    }
    public static void main(String args[])
    {
	    Thread t1=new Thread(new Threadex5(),"a");
	    Thread t2=new Thread(new Threadex5(),"b");
		t1.start();t2.start();      
	}
}
