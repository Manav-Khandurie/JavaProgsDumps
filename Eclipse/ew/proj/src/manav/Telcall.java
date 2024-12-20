package manav;
import java.util.*;
public class Telcall {
	long phno;
	String sname;
	int n;
	double amt;
	Telcall(long phno,String sname,int n) {
		this.phno=phno;
		this.sname=sname;
		this.n=n;
		amt=0.0d;
	}
	void compute() {
		 this.amt+=500;//rental fee
		 // both this.n and n are valid
		 if(this.n>=1 && this.n<=100) {
			 this.amt+=0;
		 }
		 else if(this.n>=101 && this.n<=200) {
			 this.amt+=(1*this.n);
		 }
		 else if(n>=201 && n<=300) {
			 this.amt+=(1.20*this.n);
		 }
	}
	void display() {
		System.out.println("The total computed price is : "+this.amt +" for the customer : "+this.sname+" @"+this.phno);
	}
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter\nName,Phoneno & Calls made");
		long phno;String sname;int n;
		sname=sc.nextLine();
		phno=sc.nextLong();
		n=sc.nextInt();
		Telcall obj=new Telcall(phno,sname,n);
		obj.compute();
		obj.display();
	}
}
