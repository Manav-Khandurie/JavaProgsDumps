import java.util.*;
class Calc1
{
    int count;
    boolean flag;
    int arr[],size;
    Calc1(int n)
    {
        count=0;
        size=n;
        flag=false;
        arr=new int[n];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
    }
    void case1(int first ,int last,int pos)
    {
        while(arr[pos]!=arr[first]||arr[pos]!=arr[last])
        {
            count++;
            arr[pos]++;
        }
    }
    void perform()
    {
            while(!flag)
            {
                for(int i=1;i<size-1;i++)//filling up the groves
                {   int comparision=i+1;
                    if (arr[i]<arr[comparision] && arr[i]<arr[i-1])
                        case1(i-1,i+1,i);
                    else if((arr[i]>arr[comparision] && arr[i]<arr[i-1])||(arr[i]<arr[comparision] && arr[i]>arr[i-1]))
                        continue;
                    else
                        continue;
                }
                 for(int i=1;i<size-1;i++)//updating flag
                 {
                   int comparision=i+1,t=i,copies=0;
                     if (i==size-2)
                       comparision=i+1;//last element assigined
                   else{
                       do{
                           comparision=t+++1;
                           copies+=1;
                       }
                       while(arr[comparision]!=arr[i]);
                    }
                   copies-=1;//courtesy of do while
            }
        }
    }
}
class Rain 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter total elements count:-");
        int n=s.nextInt();
        Calc1 obj=new Calc1(n);
        obj.perform();
    }
}