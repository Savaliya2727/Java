package Custom2;

import java.io.IOException;

public class CustomException2 {

	public static void isDivided(int a, int b) throws CustException {
		
		if(b == 0)
		{
			throw new CustException("Please Enter b is Above Zero");
		}
		else
		{
			System.out.print(a/b);
		}
	}
	
	public static void main(String[] arg) {
		try
		{
			isDivided(12,0);
		}
		catch(CustException e)
		{
				System.out.print(e);
		}
	}
	
}

class CustException extends IOException
{
	public CustException(String meg)
	{
		super(meg);
	}
}