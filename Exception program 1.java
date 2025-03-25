package Exception1;


public class ExceptionDemo1 {
	public static void main(String[] arg) {
		
		try 
		{
			int a=9;
			int b=0;
			
			
			int ans = a/b;
			
			System.err.println(ans);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
	}
		
}
