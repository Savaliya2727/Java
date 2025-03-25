
public class Thread1 {

	public static void main(String[] aegs) {
		
		A a = new A();
		
		a.start();
		
		/*try {
			a.sleep(3000);
			a.run();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
}


class A extends Thread
{
	@Override
	public void run()
	{
		for(int i=0; i<=5; i++)
			{
				try 
				{
					Thread.sleep(3000);
					System.out.print(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		
				//	System.out.print(i);
				}
			}
	}
}


