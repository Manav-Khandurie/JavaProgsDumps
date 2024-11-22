package proj;
import java.util.*; 
@SuppressWarnings("unchecked") 
public Aclass Jc1
{ 
   public static void main(String args[])
   {  
        ArrayList<Integer> list=new ArrayList<Integer>();//Creating arraylist  
        list.add(2);//Adding object in arraylist  
        list.add(3);  
        list.add(4);  
        list.add(5); 
        ArrayList<Integer> listd=(ArrayList<Integer>)list.clone();//duplicate list
        Iterator itr=listd.iterator();//Traversing listd through Iterator
        System.out.println("ORDER:-");
        while(itr.hasNext())
       {      
 System.out.println(itr.next()); //reads the list 
        } 
        System.out.println("REVERSE:-");
        for(int i=list.size()-1;i>=0;i--)  
{  
            System.out.println(list.get(i));     
        } 
  }//main
}//class
