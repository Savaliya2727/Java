
public class SyncDemo {

	public static void main(String[] a)
	{
		Counter c = new Counter();
		
		
		Thread t1 = new Thread(() ->{
			
			for(int i=1 ; i<=10; i++)
			{
				c.increment();
			}
		});
		
		Thread t2 = new Thread(() ->{
			
			for(int i=1 ; i<=10; i++)
			{
				c.increment();
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print("Count value is :"+c.getCount());
		
	}
	
}

class Counter
{
	private int count;

	public synchronized void increment()
	{
		count++;  // count = count+1
	}
	
	public int getCount()
	{
		return count;
	}
}













