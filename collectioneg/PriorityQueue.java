package collectioneg;
import java.util.*;
import java.util.AbstractCollection;
public class PriorityQueue {
    ArrayList<Integer> al=new ArrayList<Integer>();
    ArrayList<Integer> priority=new ArrayList<Integer>();
    Scanner sc=new Scanner(System.in);
    public void input()
    {
        System.out.print("Enter number and its priority , enter -99999 as a number to stop :-\nInput:");
        int input=sc.nextInt();
        while(input!=-99999){  
            System.out.print("Priority:");
            int p=sc.nextInt();
            al.add(input);
            priority.add(p);
            System.out.print("Input:");
            input=sc.nextInt();
        }
        //"System.out.println(al.size()+" "+priority.size());System.out.println(al+"\n"+priority);
        sort();
    }
    public void sort()
    {
        //we sort the priority list while swaping elements of list al as well to sort by priority
        for(int i=0;i<priority.size()-1;i++)
        {
            int minindex=i;
            for(int j=i+1;j<priority.size();j++)
            {
                if(priority.get(minindex)>priority.get(j))
                {
                    //ascending order
                    Collections.swap(priority,i,j);
                    Collections.swap(al,i,j);
                    minindex=j;
                }
            }
        }//display();
    }
    public void display()
    {
        System.out.print("Queue in notation Element--->Priority\n");
        for(int i=0;i<al.size();i++)
            System.out.print(al.get(i)+"--->"+priority.get(i)+"\n");
    }
    public int remove()throws NoSuchElementException
    {
        int last=al.get(al.size()-1);
        al.remove(al.size()-1);
        return last;
    }
    public boolean add(int i)
    {
        int i1=sc.nextInt();
        al.add(i);priority.add(i1);sort();
        return true;
    }
    public int peek()throws NoSuchElementException
    {
        return al.get(al.size()-1);
    }
    public boolean isEmpty()
    {
        if(al.size()==0)
            return true;
        return false;
    }
    public void process()
    {
        System.out.println("Enter:-\n1:-Remove highest priority element\n2:-Add Element\n3:-Peek\n4:-Check if queue is empty\n5:-Display\nEnter -99999 to break");
        h:while(true){
            try{
            System.out.println("Enter Choice from menu:-");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("The highest priority element removes is :- :"+remove());
                    break;
                case 2:
                    System.out.println("Enter element and its priority:-");
                    int element=sc.nextInt();
                    add(element);
                    break;
                case 3:
                    System.out.println("Topmost element is :"+peek());
                    break;
                case 4:
                    System.out.println("Is queue Empty :"+isEmpty());
                    break;
                case 5:
                    display();
                    break;
                case -99999:
                    break h;
                default:
                    System.out.println("Incorrect Input");
            }
            }
            catch(NoSuchElementException e){
                e.printStackTrace();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    /**public static void main(String args[])
    {
        PriorityQueue obj=new PriorityQueue();
        obj.input();obj.process();
    }**/
}//PriorityQueue