package manav;

public class Threadex implements Runnable{

	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		
	}
	public static void main(String args[]) {
		Runnable t1=new Thread(new Threadex(),"Runnable Thread");
		try {
			((Thread) t1).setPriority(10);
		  ((Thread) t1).start();//upcasting 
		  
		}catch(Exception e)
		{}
		System.out.println("Done with main");
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
