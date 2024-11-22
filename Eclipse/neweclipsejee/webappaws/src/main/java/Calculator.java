
import javax.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.io.*;
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	boolean check(String s)
    {
        int i=0;boolean flag=true;//returns true when operators are present
        StringTokenizer str=new StringTokenizer(s,"+-*/%^");
        StringTokenizer str1=new StringTokenizer(s,".0123456789");
        System.out.println(s+"\t"+str.countTokens()+"\t"+str1.countTokens());
        if(str.countTokens()<=str1.countTokens())return true;
        
	return (str.countTokens()>1)? false:true;
    }
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();  
				String inputeq=request.getParameter("inputeq");
				inputeq.trim();//System.out.println(inputeq);
				boolean flag=false;String s=inputeq;
		        double value=0;
		        do{
	            String n1="",n2="";char op='\0';int j=0;
	            try{while(Character.isDigit(s.charAt(j)))
	            {
	                n1+=s.charAt(j++);if(s.charAt(j)=='.')n1+=s.charAt(j++);
	            }}catch(Exception e){}
	            op=s.charAt(j++);System.out.println(n1);System.out.println(op);
	            try{while(Character.isDigit(s.charAt(j)))
	            {
	                n2+=s.charAt(j++);if(s.charAt(j)=='.')n2+=s.charAt(j++);
	            }}catch(Exception e){}
	            n1.trim();n2.trim();System.out.println(n2);
	            if(n1.length()==0)
	            	n1="0";
	            if(n2.length()==0)
	            	n2="0";
	            switch(op){
	                case '+':
	                    value=Double.parseDouble(n1)+Double.parseDouble(n2);break;
	                case '-':
	                    value=Double.parseDouble(n1)-Double.parseDouble(n2);break;
	                case '*':
	                    value=Double.parseDouble(n1)*Double.parseDouble(n2);break;
	                case '/':
	                    value=Double.parseDouble(n1)/Double.parseDouble(n2);break;
	                case '%':
	                    value=Double.parseDouble(n1)%Double.parseDouble(n2);break;
	                case '^':
	                    value=Math.pow(Double.parseDouble(n1),Double.parseDouble(n2));break;
	            }
	            String nstr=s.substring(j);
	            s=value+nstr;
	            flag=check(s.trim());
	        }while(!flag);
		    out.print("<html><body><h1>Result: "+value+" </h1></body></html>");
		    out.close();
		}
	}

