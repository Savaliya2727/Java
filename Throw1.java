package Throw1;

public class Throw1 {
	
	public static void main(String[] arg) {
		
		Demo s = new Demo();
		
		try {
			s.ageValiddetion(15);
		}
		catch(IllegalArgumentException e)
		{
			System.out.print(e);
		}
	}
	
}

// IllegalArgumentException

class Demo
{
	public void ageValiddetion( int no)
	{
		if(no < 18)
		{
			//throw new IllegalArgumentException(); -- And Used 
			throw new IllegalArgumentException("Please Enter  Your Above  Age 18....!");
			
		}
		else 
		{
			System.out.print("Age is Valid....!");
		}
	}
}