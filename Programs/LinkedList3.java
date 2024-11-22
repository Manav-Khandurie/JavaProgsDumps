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
           System.out.println(ll.getLast());
           System.out.println(ll.getFirst());
           System.out.println(ll.get(2));
           ll.remove();
           System.out.println(ll);
           lld.clear();
           System.out.println(lld);
           Iterator itr=ll.descendingIterator();
       }  
    } 