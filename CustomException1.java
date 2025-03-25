package Custom1;

public class CustomException1 {

	public static void main(String[] arg)
	{
		Demo d = new Demo();
		try
		{
			d.add(17);
		}	
		catch( MyException e)
		{
			System.out.print(e); // and [  e.printStackTrace();  ]
		}
	}	
}
class Demo
{
	public void add(int no) throws MyException
	{
		if(no < 18)
		{
			throw new  MyException("Please Enter Valid Age....!");
		}
		else
		{
			System.out.print("Age is Valid..!");
		}
	}
}
class MyException extends Exception
{
	public  MyException(String meg)
	{
		super(meg);
	}
}
