package collectioneg;
import java.util.*;
@SuppressWarnings("unchecked") 
class TestArrayList
{
    public static void main (String args[])
    {
            ArrayList<Integer> al=new ArrayList<Integer>();
            System.out.println("1st [Printing Directly]:--");
            al.add(1);al.add(2);al.add(3);
            System.out.println(al);
            System.out.println("2nd [Printing Using ilterator]:--");
            Iterator itr=al.iterator();
            while(itr.hasNext())
            {   System.out.print(itr.next()+"\t");
            }
            System.out.println();
            System.out.println("3rd [Printing using for-each loop]:--");
            for(int test:al)
                System.out.print(test+"\t");
            System.out.println();
            System.out.println("4th [Printing using get method]:--");
            for(int i=0;i<al.size();i++)
                System.out.print(al.get(i)+"\t");
            System.out.println();
            System.out.println("Clone [By using .clone()]:");
            ArrayList<Integer> ald=new ArrayList<Integer>();
            ald=(ArrayList<Integer>)al.clone();
            System.out.println(ald);
            System.out.println("Reverse 1:[using Collections.reverse(al)]:");
            Collections.reverse(ald);
            System.out.println(ald);
            System.out.println("Adding al and ald");
            al.addAll(ald);//adding collection al and ald
            System.out.println(al);
            
            ald=(ArrayList<Integer>)al.clone();
            System.out.println("Remove 1[using remove()]:--");
            ald.remove(3);//removes first occurence of 3
            System.out.println(ald);
            System.out.println("clear :-");
            ald.clear();
            System.out.println("After clear :-"+ald);
            System.out.println();
    }
}