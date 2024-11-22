package manav;
public class Customer{    
		public static void main(String args[]){    
			final Threadex3 c=new Threadex3();    
			new Thread(){    
			public void run(){c.withdraw(-1);}    
			}.start();    
			new Thread(){    
			public void run(){c.deposit(10000);}    
			}.start();    
			System.out.println("done");
		}
}