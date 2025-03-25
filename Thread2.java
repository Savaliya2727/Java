
public class Thread2 {

	public static void main(String[] aegs) {
		
		B b = new B();
		B b1 = new B();
		
		b.start();
		b1.start();
		
		b.run();
		b1.run();
		
		
		
	}
	
}


class B extends Thread
{
	@Override
	public void run()
	{
		for(int i=0; i<=5; i++)
			{
				try 
				{
					Thread.sleep(1000);
					System.out.print(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		
				}
			}
	}
}


