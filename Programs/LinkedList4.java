import java.util.*;  
public class LinkedList4 
{  
        public static void main(String [] args)  
        {  
           LinkedList<String> ll=new LinkedList<String>();  
           ll.add("1"); ll.add("1"); ll.add("3"); ll.add("4");ll.add("1"); 
           ll.addFirst("0");ll.addLast("5");ll.add("0");
           System.out.println(ll);
           ll.remove("0");
           ll.removeFirstOccurrence("1");
           System.out.println(ll);
           ll.removeLastOccurrence("1");
           System.out.println(ll);
           for(int i=ll.size()-1;i>=0;i--)  {  
            System.out.println(ll.get(i));     
            } 
           Iterator i1=ll.descendingIterator();
           while(i1.hasNext())
               System.out.print(i1.next()+"\t");
        }  
} 