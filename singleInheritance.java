
public class singleInheritance {

	public static void main(String[] arg) {
		
		B obj = new B();
		
		obj.showA();
		obj.showB();
		
	}
	
}

class A
{
	void showA()
	{
		System.out.println("Hello i'm from class A");
	}
}

class B extends A
{
	void showB()
	{
		System.out.println("Hello i'm from class B");
	}
}
