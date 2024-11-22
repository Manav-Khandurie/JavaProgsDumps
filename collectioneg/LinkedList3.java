package collectioneg;
import java.util.*;  
public class LinkedList3 
{  
        public static void main(String [] args)  
        {  
           
           LinkedList<String> ll=new LinkedList<String>();  
           ll.add("1"); ll.add("2"); ll.add("3"); ll.add("4");  
           ll.addFirst("0");ll.addLast("5");
           System.out.println(ll);
           ll.remove("0");
           System.out.println(ll);
           LinkedList<String> lld=(LinkedList<String>)ll.clone();
           System.out.println(lld +"\tclone");
           lld.clear();
           System.out.println(" : "+ll);
           System.out.println(ll.element());
           System.out.println(ll.element());
           System.out.println(ll.getLast());
           System.out.println(ll.getFirst());
           System.out.println(ll.get(2));
           ll.remove();
           System.out.println(ll);
           lld.clear();
           System.out.println(lld+"\n \n");
           
           LinkedList<String> lldd=(LinkedList<String>)ll.clone(); 
           lldd.add("1"); lldd.add("1"); lldd.add("3"); lldd.add("4");lldd.add("1"); 
           lldd.addFirst("0");lldd.addLast("5");lldd.add("0");
           System.out.println(lldd);
           lldd.remove("0");
           lldd.removeFirstOccurrence("1");
           System.out.println(lldd);
           lldd.removeLastOccurrence("1");
           System.out.println(lldd);
           for(int i=lldd.size()-1;i>=0;i--)  {  
            System.out.println(lldd.get(i));     
            } 
           Iterator i1=lldd.descendingIterator();
           while(i1.hasNext())
               System.out.print(i1.next()+"\t");
        }  
} 