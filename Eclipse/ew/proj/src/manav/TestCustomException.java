package manav;
public class TestCustomException{
	
	public static void main(String args[]) {
		
		try {
			perform();
		}
		catch(CustomE e) {
			e.getMessage();
			e.printStackTrace();
		}
		catch(Exception E) {}
		finally {
			System.out.println("Done");
		}
	}

	 static void perform()throws CustomE {
		 throw new CustomE("THIS IS A CUSTOM MESSAGE");
		
	}
}
