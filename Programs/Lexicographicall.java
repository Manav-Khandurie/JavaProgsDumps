import java.util.*;
class Lexicographicall extends PerformTask
{
    String words[];
    void constraints(String word,int length)
    {
        if(!(length>0&&length<(int)Math.pow(10,5)&&word.length()>=1&&word.length()<=100))
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input amount of words :-");
        int length=sc.nextInt();
        words=new String[length];
        System.out.println("Input:-");
        for(int i=0;i<words.length;i++)
        {
            words[i]=sc.next();
            constraints(words[i],length);
        }
    }
    void perform()
    {
        PerformTask obj=new PerformTask();
        System.out.println("Output:--");
        for(int i=0;i<words.length;i++)
        {
            obj.combinations(words[i]);
        }
    }
    public static void main(String args[])
    {
        Lexicographically obj=new Lexicographically();
        obj.input();
        obj.perform();
    }
}