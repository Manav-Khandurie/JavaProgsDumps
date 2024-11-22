package manav;
public class Threadex3{    
	int amount=10000;    
    
	synchronized void withdraw(int amount){    
		System.out.println("going to withdraw...");   
		if(amount<0)
			notifyAll();
		if(this.amount<amount){    
			System.out.println("Less balance; waiting for deposit...");    
			try{wait();}catch(Exception e){}    
		}    
		this.amount-=amount;    
		System.out.println("withdraw completed...");    
	}    
    
	synchronized void deposit(int amount){    
		System.out.println("going to deposit...");    
		this.amount+=amount;    
		System.out.println("deposit completed... ");    
		notify(); 
	}    
}    
    
