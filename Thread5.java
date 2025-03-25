

public class Thread5 {

	public static void main(String[] aegs) {
		
		A1 td = new A1();
		td.start();
		
		B1 td2 = new B1();
		td2.start();
		
	}
	
}


class A1 extends Thread
{
	public void run()
	{
		for(int i=0; i<=10; i++)
			{
			System.out.println("Hello.... 1");
				try
				{
					sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		
				}
			}
	}
}

class B1 extends Thread
{
	public void run()
	{
		for(int i=0; i<=10; i++)
			{
				try 
				{
					sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Hello.... 2");
			}
	}
}

