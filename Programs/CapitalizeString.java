//String Handling
import java.util.*;
class CapitalizeString
{
    StringBuffer str;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter the string :-");
        String str=sc.nextLine();
            str.trim();
            str=" "+str;
            this.str=new StringBuffer(str);
    }
    void perform()
    {
        StringBuffer str=new StringBuffer("");
        for(int i=0;i<this.str.length();i++)
            {
                 char ch=this.str.charAt(i);
                 int value=(int)ch;
                    if(value>=97 && value<=122)
                    {
                        value-=32;
                    }str.append((char)value);
             }this.str=str;
        }
    
        void display()
        {
            System.out.println("New string :-\n"+this.str);
        }
    public static void main(String args[])
    {
        CapitalizeString obj=new CapitalizeString();
        obj.input();
            obj.perform();
            obj.display();
    }//main
}//class