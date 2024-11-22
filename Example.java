    import java.time.*;
    public class Example{  
    
    public static void main(String args[]){  
    //if(false){
    String joinString1=String.join("-/","welcome","to","javatpoint"); 
    int a=4;int arr[][][]=new int[8][9][0]; 
    double c=9.999;byte b=9;int d=(int)(double)(c+b);
    System.out.println(d);
    System.out.println(Integer.parseInt("4")+5);  
    LocalTime time = LocalTime.now();
    System.out.println(time);
    Example obj=new Example();
    System.out.println(obj+" "+obj.hashCode());
    try {
        //int a1=9/0;
    }
    catch(Exception e)
    {
        System.out.println(e);
        e.printStackTrace();
    }
    finally{
        System.out.println("DONE");
    }
    System.out.println(); 
    System.out.println(((Object)arr).getClass().getSimpleName()); 
    }//else System.out.println("here");
    } 
