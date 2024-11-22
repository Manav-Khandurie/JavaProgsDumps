import java.util.*;
class PerformSteps
{
    int arr[];
    int value=0,last=0;;
    int steps[]=new int[100];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:-");
        last=sc.nextInt();
        arr=new int[last];
        System.out.println("Enter array:-");
        for(int i=0;i<last;i++)
            arr[i]=sc.nextInt();
        last-=1;//adjustment
    }
     int count(int pointer,int last,int i)
    {
        if(pointer==last)
        {
            
            return 1;
        }
        else if((pointer+i)>=arr.length)
        return 0;
        else if(pointer>last)
        {
            return 0;
        }
        else if(pointer+i>last)
        {
            return 0;
        }
        else if(arr[pointer+i]==0)
        {
            //System.out.println(arr[pointer+i]);
            return 0;
        }
        else if(pointer < last)
        {
            int temp=i; /**int ans=count(pointer+arr[temp],last,i-1);
            while (temp>0)
            {
                ans=(ans==Math.min(count(pointer+arr[temp],last,i-1),ans))? count(pointer+arr[temp],last,i-1):ans;
            }**/
            //while(temp>0)
            //System.out.println(arr[pointer+arr[i]]);
            return 1+count(pointer+arr[i],last,i);
            //return 0;
        }
        
        else 
        {
            return 0;
        }
        //else return 0;
    }
    void lowest(int value)
    {
        int low=arr[0];
        for(int i=1;i<value;i++)
            if(arr[i]<low)
            low=arr[i];
        System.out.println("Lowest steps will be:-"+low);
    }
    void perform()
    {
            
        for(int i=arr[0];i>0;i--)
        {
            steps[value++]=count(0,4,i);
        }
        /*for(int i=0;i<value;i++)
        {
            System.out.println(steps[i]);
        }*/
        lowest(value);
    }
    public static void main(String args[])
    {
        PerformSteps obj=new PerformSteps();
        //System.out.println(obj.arr[0]);
        //System.out.println(obj.count(0,4,1));
        obj.input();
        obj.perform();
    }
}