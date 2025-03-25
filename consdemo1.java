
public class consdemo {

	public static void main(String[] arg) {
		
		B b1 = new B();
		B b2 = new B(1061,"IMCA");
		B b3 = new B(10);
		
	}
	
}

class B
{
	B()
	{
		System.out.print("Good Morning   ");
	}
	
	B(int no)
	{
		System.out.print("Your number is : "+no);	
	}
	
	B(int a,String name)
	{
		System.out.print(name);
		System.out.println(a);
	}
	
}