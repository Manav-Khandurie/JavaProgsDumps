//making calculator
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.*;
import java.io.*;
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	boolean check(String s)
    {//works only for non -ve  whole numbers without bodmas :-)
        int i=0;boolean flag=true;//returns true when operators are present
        StringTokenizer str=new StringTokenizer(s,"+-*/%^");
        //System.out.println(s+"\t"+str.countTokens());
	return (str.countTokens()>1)? false:true;
    }
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();  
				String inputeq=request.getParameter("inputeq");
				inputeq.trim();//System.out.println(inputeq);
				boolean flag=false;String s=inputeq;
		        int value=0;
		        do{
	            String n1="",n2="";char op='\0';int j=0;
	            try{while(Character.isDigit(s.charAt(j)))
	            {
	                n1+=s.charAt(j++);
	            }}catch(Exception e){}
	            op=s.charAt(j++);//System.out.println(n1);System.out.println(op);
	            try{while(Character.isDigit(s.charAt(j)))
	            {
	                n2+=s.charAt(j++);
	            }}catch(Exception e){}
	            n1.trim();n2.trim();//System.out.println(n2);
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
	            flag=check(s);
	        }while(!flag);
		    out.print("<html><body><h1>Result: "+value+" </h1></body></html>");
		    out.close();
		}//get
	}//class
