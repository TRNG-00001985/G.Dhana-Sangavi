package Default;

public class ExceptionHandling  {

	public static void main(String[] args) throws Exception {
		int a=2,b=0;
		try
		{
			System.out.println("exception ");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());	
		}

	}

}
