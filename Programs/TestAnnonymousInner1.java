class TestAnnonymousInner1{  
 public static void main(String args[]){
     int val=9;
 Eatable ei=new Eatable()
 {  public int num=6;
  public void eat()
  {System.out.println("nice fruits");
    System.out.println(num+val);
    }  
 };  
 ei.eat(); 
 System.out.println();
 }  
}  