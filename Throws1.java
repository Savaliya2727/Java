package Throws1;

public class Throws1 {

	public static void main(String[] arg) {
		
		ThrowExample te = new ThrowExample();
		
		try
		{
			te.getData(1,20);
		}
		catch(IllegalArgumentException e)
		{
			System.out.print(e);
		}
		catch(ArithmeticException e)
		{
			System.out.print(e);
		}
	}
	
}

class ThrowExample
{
	public void getData(int tag, int no) throws IllegalArgumentException,ArithmeticException
	{
		if(tag == 1)
		{
			if(no < 18)
			{
				throw new IllegalArgumentException();
			}
			else
			{
			System.out.print("Age is Valid....!");
			}
		}
		else 
		{
			int ans = no/0;
			throw new ArithmeticException();
		}
	}
}
