//Displaying array
import java.util.*;
import java.io.*;
class Students
{
    String arr[];int rollno[];
    void print(String arr[],int rollno[])
    {
        
        System.out.println("Output ");
        for(int i=0;i<=arr.length;i++)
        {
            System.out.println(arr[i]+"\t"+rollno[i]);
        }

    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length ");
        int length=sc.nextInt();
        arr=new String[length];
        rollno=new int[length];
        System.out.println("Enter name with roll number");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.next();
            rollno[i]=sc.nextInt();
        }print(arr,rollno);
    }
    public static void main(String args[])
    {
        try{
        Students obj=new Students();
        obj.input();
        }
        catch(ArrayIndexOutOfBoundsException E)
        {
            System.out.println(E);
        }
        catch(Exception E)
        {
            System.out.println(E);
        }
        finally
        {
            System.out.println("All Executed");
        }
    }//main
}//class