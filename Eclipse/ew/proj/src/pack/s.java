package pack;

import java.io.IOException;

public class s{  
	  void m()throws IOException{  
	    throw new java.io.IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){e.getMessage();}  
	  }  
	  public static void main(String args[]){  
	   s obj=new s();  
	   obj.p();  
	   System.out.println("normal flow");  
	  }  
	}  