package manav;

public class c {

	public c() {
		int a=Integer.MAX_VALUE;
		int b=Integer.MIN_VALUE;
		long c=Long.MAX_VALUE+Long.MAX_VALUE;
		long d=Long.MIN_VALUE;
		double f=Double.MAX_VALUE;
		double g=Double.MIN_VALUE;
		char h=Character.MAX_VALUE;
		char i=Character.MIN_VALUE;
		int octal=010;
		int binary=0b1001;
		int hex=0xA;
		System.out.print(a+" "+b+" "+c+" "+d+" "+f+" "+g+" "+h+" "+i+"\t"+octal+"\t"+binary+"\t"+hex);
		int x=-1,y=-5; String r="";
		if(x < 5) {

	           if(y > 0)
	           {
	           if(x > y)
	           {
	           r += "1";

	           } else r += "2";
	           }
	            else r += "3";
		}
	           else r += "4";
	}
	public static void main(String args[])
	{
		new c();
	}
}
