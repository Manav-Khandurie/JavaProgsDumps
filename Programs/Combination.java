import java.util.*;
class Combination
{   
        static void sort(int arr[]){
            for(int i=0;i<arr.length;i++)
            {   
                for (int j=0;j<arr.length-1-i;j++){
                   if(arr[j]>arr[j+1]){
                       int temp=arr[j];
                       arr[j]=arr[j+1];
                       arr[j+1]=temp;
                   }
                }
            }
        }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		int arr[]=new int[3];
		for(int i=0;i<arr.length;i++)
		arr[i]=sc.nextInt();
		int c=0,val=0;
		System.out.println("Combinations are");
		for(int i=0;i<2;i++)
		{
			int val1=arr[i];
			for(int j=i+1;j<3;j++)
			{    if(val1==arr[j])c++;
			 }
		}sort(arr);
		if(c==0)
		{
        	  for(int i=0;i<3;i++)
		   {
			for(int j=0;j<3;j++)
			 {
				for(int k=0;k<3;k++)
				{   if(!(i==j||j==k||k==i))
				    {
					System.out.println(arr[i]*100+arr[j]*10+arr[k]);
				    }
				}
                        }
                    }
                }
		else if(c==1)
		{ 
		   int b[]=new int[6];
    		   for(int i=0;i<3;i++)
		   {
			for(int j=0;j<3;j++)
			 {
				for(int k=0;k<3;k++)
				{   if(!(i==j||j==k||k==i))
				    {   
					b[val++]=arr[i]*100+arr[j]*10+arr[k];
				    }
				}
                        }
                   }
                   sort(b);
                   for(int i=0;i<6;i+=2)
		   {
			System.out.println(b[i]);
                   }
	        }
		else 	System.out.println(arr[0]*100+arr[1]*10+arr[2]);
	      }//main
}//class