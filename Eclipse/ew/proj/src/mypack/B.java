package mypack;
//import pack.A;
public class B  {
	
	public void dis() {
		System.out.println("In mypack ,class B, dis");
	}
	public static void main(String args[]) {
		pack.A obj=new pack.A();
		obj.dis();
		
	}
}
