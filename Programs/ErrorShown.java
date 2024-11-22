class ErrorShown extends ErrorOccured
{
	public static void main(String args[])
	{
		ErrorOccured obj=new ErrorOccured();
		try{
			obj.n(args[0],args[2]);
		}
		catch(NumberFormatException E)
		{
			System.out.println(E);
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
		finally{
			System.out.println("ALL EXECUTED");
		}
	}//main
}//class