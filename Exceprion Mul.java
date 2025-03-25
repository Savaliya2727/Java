package MulException3;

public class ExceprionMul3 {

	public static void main(String[] arg) {
	
		//  NullPointerException
		try
		{
			String name = null; // "Prince"
			int len = name.length();
			
			System.out.println(len);
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
			
		}
		
		
		//  ArithmeticException
		try
		{
			int a = 10;
			int b = 2;
			
			int ans = a/b;
			
			System.out.println(ans);

		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		//  ArrayIndexOutOfBoundsException
		try
		{
			int no[] = {1,2,3,4,5,6,7,8,9};
			
			System.out.println(no[5]);
		}
		catch(ArrayIndexOutOfBoundsException e )
		{
			System.out.println(e.getMessage());
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}