
public class staticdemo2 {
	
	public static void main(String[] arg) {
		
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1();
		
		d1.increment();
		d2.increment();
		
	}
	
}

class Demo1 
{
	static int no = 1;
	
	void increment()
	{
		no++;
		
		System.out.println("Your count is : "+no);
	}
}