

public class Thread4 {

	public static void main(String[] aegs) {
		
		D d = new D();
		D d1 = new D();
		
		//c.start();
		//c1.start();
		
		d.run();
		d1.run();
		
		System.out.println(d.MAX_PRIORITY);
	//	System.out.println(d.getPriority());
	//	System.out.println(d1.getPriority());
		
		d.start();
		d1.start();
		
	}
	
}


class D extends Thread
{
	@Override
	public void run()
	{
		for(int i=10; i<=15; i++)
			{
				try 
				{
					Thread.sleep(1000);
					System.out.println(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		
				}
			}
	}
}
/*
class D1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=11; i<=15; i++)
			{
				try 
				{
					Thread.sleep(1000);
					System.out.println(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		
				}
			}
	}
}*/

