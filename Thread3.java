
public class Thread3 {

	public static void main(String[] aegs) {
		
		C c = new C();
		C c1 = new C();
		
		//c.start();
		//c1.start();
		
		c.run();
		c1.run();
		
		System.out.print(c.getPriority());
		System.out.print(c1.getPriority());
		
	}
	
}


class C extends Thread
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


