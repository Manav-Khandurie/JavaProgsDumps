//take input of date and calculate days
import java.util.*;
class Date
{	
	static int calculate(int day,int month,int year)
	{
		int lyrs=0,nlyrs=0,tyrs=0,ans=0,j=0;
		tyrs=year-1970;
		if(tyrs<0||month>31||day>31){
		System.out.println("Wrong input!!");
		System.exit(0);
		}
		for(int i=1970;i<year;i++)
		{
        		if(i%400==0)
        		{
            		   lyrs+=1; 
                        }
			else if(i%4!=0)
			nlyrs+=1;
			else
			lyrs+=1;
		}
		ans=nlyrs*365+lyrs*366;
		for(j=1;j<month;j++){
		switch(j){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 11:
			ans+=31;
			break;
		case 2:
			if(year%4==0)
			ans+=29;
    			else
        		ans+=28;
        		break;
		default:
			ans+=30;
		}
		}
		return ans+day-1;//as we dont count that perticular day
	}
	public static void main(String args[])
	{
		int day= Integer.parseInt(args[0].charAt(0)+""+args[0].charAt(1));
		int month= Integer.parseInt(args[0].charAt(3)+""+args[0].charAt(4));
		int year= Integer.parseInt(args[0].charAt(6)+""+args[0].charAt(7)+""+args[0].charAt(8)+""+args[0].charAt(9));
		int ans=calculate(day,month,year);
		System.out.println("The totals days will be :-"+ans);
	}//main	
}//class