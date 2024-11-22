package collectioneg;
import java.util.*;
class Algorithm extends ssc
{
    Scanner sc=new Scanner(System.in);
    int choice;
    ArrayList<Integer> al=new ArrayList<Integer>();
    void input()
    {
        System.out.println("Enter\n1:-Selection Sort\n2:-Priority queue");
        choice=sc.nextInt();
        sc.nextLine();
        if(choice>2){
            System.out.println("Incorrect choice!!");
            System.exit(0);
        }
    }
    void input(int i)
    {
        if(i==1)
        {
            System.out.println("press -99999 to exit insertion");
            int input=0;
            input=sc.nextInt();
            while(input!=-99999){      
            al.add(input);
            input=sc.nextInt();
            }
        }
    }
    int findMinLoc(int i,ssc s1)
    {
        int minindex=i;
        for(int j=i+1;j<al.size();j++)
        {
            if(s1.compare(al.get(minindex),al.get(j))>0)
             minindex=j;
        }
        return minindex;
    }
    void displayarraylist()
    {
        for(int i:al)
            System.out.print(i+"\t");
        System.out.println();
    }
    void swap(int i,int j)
    {
            //Collections.sort(al);
            Collections.swap(al,i,j);
    }
    void selectionsort(ArrayList<Integer> al,ssc s1)
    {
        for(int i=0;i<al.size()-1;i++)
        {
            int minindex=findMinLoc(i,s1);
            //Collections.swap(al,i,minelement);
            swap(i,minindex);
        }
	System.out.println("In ascending order:--");
        displayarraylist();
    }
    public static void main(String[] args) {
        Algorithm obj=new Algorithm();
        obj.input();
        if(obj.choice==1)
        {    
            obj.input(1);
            obj.selectionsort(obj.al,new ssc());
        }
        else
        {
            PriorityQueue p=new PriorityQueue();
            p.input();p.process();
        }
    }//main
}//class