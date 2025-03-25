
public class interfaca {

	public static  void main(String[] arg) {
		
		C obj = new C();
		obj.showA();
	}
}

interface A
{
	void showA();
}

interface B
{
	void showB();
}

class C implements A, B
{
	@Override
	public void showA() {
		System.out.print("Hello A");
	}
}