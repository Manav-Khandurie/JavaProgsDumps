import java.util.*;
class CalculatorPower 
{
        static long power(int a,int b) throws CustomError1
    {
        if(a<0 || b<0){
                String message="numbers can't be negative";
            throw new CustomError1("numbers can't be negative");
            //return 0;
        }if(a==0){
            throw new CustomError1("numbers can't be Zero");
            //return 0;
        }
        return (long)Math.pow(a,b);
    }
    static void constranits(int a,int b)
    {
        if(a<-10 || a>10 || b<-10 || b>0)
            System.exit(0); 
    }
    public static void main(String args[])
    {
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b:-");    
        int a=sc.nextInt();
        int b=sc.nextInt();
        constranits(a,b);
        long ans=power(a,b);
        System.out.println("Answer :- "+ans);    
        }
        catch(CustomError1 E)
        {
            System.out.println(E);    
        }
        catch(Exception E)
        {
            System.out.println(E);    
        }
    }
}