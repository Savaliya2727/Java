package DEMO;


public class DEMO2 {

	public static void main (String[] a) {
		
		try
		{
			String a1 ="abcd";
			char B = a1.charAt(3);
			
			System.out.println(B);
		}
		
		catch( Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.err.println("Continue...");
		}
	}
}
