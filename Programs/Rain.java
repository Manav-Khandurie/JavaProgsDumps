//calculating rain trapped
import java.util.*;
class Rain
{
    int arr[]={4,2,0,3,2,5};int ans=0;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array:--");
        int length=sc.nextInt();
        arr=new int[length];
        System.out.println("Input:--");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }System.out.println("");
    }
    void perform()
    {
        print(arr);
        boolean flag=false;int l=1;
        while(!flag)
        {
            int count=1;
            for(int i=1;i<arr.length-1;i++)
            {
                int foward=i+1;int backward=i-1;
                if(arr[i]>arr[foward]&&arr[i]>arr[backward]){
                    //System.out.println(i+" &1 ");
                    continue;
                }
                
                if(arr[i]>arr[foward]&&arr[i]<arr[backward]){
                    //System.out.println(i+" &2 ");
                  continue;  
                }
                
                if(arr[foward]==arr[i]||(arr[i]<arr[foward]&&arr[i]>arr[backward]))
                {
                    int start=foward;
                    for(int j=i+1;j<arr.length;j++)
                    {
                        if(arr[j]!=arr[i])
                        {
                            foward=j;
                            break;
                        }
                        else 
                        {
                            count++;//System.out.println(count);
                        }
                    }
                    //System.out.println(backward+"       "+i+"      "+foward);
                    int diff=Math.min(Math.abs(arr[backward]-arr[i]),Math.abs(arr[foward]-arr[i]));
                    //System.out.println(diff);
                    //System.out.println("!");
                    //System.out.println(i+"\t"+diff+"  "+count+"   "+ans);
                    ans+=diff*count;
                    for( int k=start-1;k<foward;k++)//k=start-1 k<=end
                    arr[k]+=diff;
                    //print(arr);
                    //System.out.println(start+" ^ "+end);
                }
                else
                {
                    int diff=Math.min(Math.abs(arr[backward]-arr[i]),Math.abs(arr[foward]-arr[i]));
                    ans+=diff;//System.out.println(i+"\t"+diff+"  "+ans);
                    int value=arr[i]+diff;
                    arr[i]=value;
                    count=1;
                    //print(arr);
                }
            }if(l==100) flag=true;
            //System.out.println("\t #"+l+"#  ");
            l++;
        }print(arr);
        System.out.println("OUTPUT:-- "+ans);
    }
    public static void main(String args[])
    {
        Rain obj=new Rain();
        obj.input();
        obj.perform();
     }//main
    }//class
