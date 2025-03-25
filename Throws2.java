package Throws1;



public class Throws2 {

	public static void main(String[] arg) {
		
		example2 te = new example2();
		
		try
		{
			te.getData(20);
		}
		catch(IllegalArgumentException e)
		{
			System.out.print(e);
		}
	
	}
	
}

class example2
{
	public void getData( int no) throws IllegalArgumentException
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
}
