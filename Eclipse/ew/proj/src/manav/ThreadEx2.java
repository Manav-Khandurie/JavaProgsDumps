package manav;

import java.util.Scanner;
import java.io.*;
public class ThreadEx2 extends Thread{

	static int counter=0;
	static int amount=50000;
	Scanner sc=new Scanner(System.in);
	public synchronized void increment() {
		counter++;
	}
	public synchronized void deposit() {
		System.out.println("Enter deposit amt for customer :"+Thread.currentThread().getName());
		System.out.println("In Deposit ");
		int deposit=sc.nextInt();
		this.amount+=deposit;
		System.out.println("Deposit sucessfull!!");
		notifyAll();
	}
	public synchronized void withdraw(int amount) {
		increment();
		System.out.println(this.amount);
		if(this.amount<amount)
		{
			System.out.println("The balance for customer :"+Thread.currentThread().getName()+" isnt enough please deposit");
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			deposit();
			System.out.println("The mew balance is :- "+(this.amount-amount));
		}
	}
	public void run() {
		System.out.println("Enter amt to be withdrawed for customer :"+Thread.currentThread().getName());
		withdraw(sc.nextInt());
	}
	public static void main(String args[]) {
		ThreadEx2 t1= new ThreadEx2();
		
		try {
			t1.start();
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("total customers:"+ThreadEx2.counter);
	}
}
