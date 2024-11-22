import java.util.*;
public class k
{
    boolean check(String s)
    {
        int i=0;boolean flag=true;//returns true when operators are present
        StringTokenizer str=new StringTokenizer(s,"+-*/%^");
        System.out.println(s+"\t"+str.countTokens());
	return (str.countTokens()>1)? false:true;
    }
    public static void main(String args[])
    {   try{
        k obj=new k();
        //String s="45+92-63";
        String s="69+55-5";
        boolean flag=false;
        int value=0;
        do{
            String n1="",n2="";char op='\0';int j=0;
            try{while(Character.isDigit(s.charAt(j)))
            {
                n1+=s.charAt(j++);
            }}catch(Exception e){}
            op=s.charAt(j++);System.out.println(n1);System.out.println(op);
            try{while(Character.isDigit(s.charAt(j)))
            {
                n2+=s.charAt(j++);
            }}catch(Exception e){}
            n1.trim();n2.trim();System.out.println(n2);
            switch(op){
                case '+':
                    value=Integer.parseInt(n1)+Integer.parseInt(n2);break;
                case '-':
                    value=Integer.parseInt(n1)-Integer.parseInt(n2);break;
                case '*':
                    value=Integer.parseInt(n1)*Integer.parseInt(n2);break;
                case '/':
                    value=Integer.parseInt(n1)+Integer.parseInt(n2);break;
                case '%':
                    value=Integer.parseInt(n1)%Integer.parseInt(n2);break;
                case '^':
                    value=(int)Math.pow(Integer.parseInt(n1),Integer.parseInt(n2));break;
            }
            String nstr=s.substring(j);
            s=value+nstr;
            flag=obj.check(s);
        }while(!flag);
        System.out.println(value);
        }catch(Exception e){e.printStackTrace();}
    }
}
