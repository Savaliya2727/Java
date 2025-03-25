public class Abstract {
	
	public static void main(String[] arg) {
		
		B b = new B();
		b.show();
		b.showA();
		
	}
	
}

abstract class A
{
	abstract void show();
	void showA()
	{
		System.out.println("show A");
	}
}

class B extends A
{

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("Absrtact show");
	}
	
}