import java.util.*;
class Gem
{
    String stones[];int count;
    Gem(int length)
    {
        stones=new String[length];
        count=0;
    }
    String ans(String s)
    {
        String newstring="";
        for(int i=0;i<s.length();i++)
        {
            int frequency=0;
            for(int j=i-1;j>0;j--)
            {
                if(s.charAt(j)==s.charAt(i))
                {
                    frequency++;
                }
            }
            if(frequency==0)
            newstring+=s.charAt(i);
        }
        return newstring;
    }
    void update(String stones[])
    {
        for(int i=0;i<stones.length;i++)
        {
            String newstring=ans(stones[i]);
            stones[i]=newstring;
        }//print(stones);
    }
    void print(String stones[])
    {
        System.out.println("\n");
        for(int i=0;i<stones.length;i++)
        {
            System.out.println(stones[i]);
        }System.out.println("\n");
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input:-");
        for (int i=0;i<stones.length;i++)
        {
            stones[i]=sc.next();
        }
        update(stones);
    }
    void check(char ch)
    {
        int count=0;
        for (int i=0;i<stones.length;i++)
        {
            for(int j=0;j<stones[i].length();j++)
            {
                if(ch==stones[i].charAt(j))
                {
                    count++;
                    break;
                }
            }
        }
        if(count==stones.length)
        {this.count++;
        }
    }
    void perform()
    {
        String search=stones[0];
        for(int i=0;i<search.length();i++)
        {
            check(search.charAt(i));
        }
        System.out.println("Output:-"+this.count);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input length:-");
        int n=sc.nextInt();
        Gem obj=new Gem(n);
        obj.input();
        obj.perform();
    }
}