
public class intarfecademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C objC = new C;
		C.showA();
		
	}

}

interfaca A 
{
	void showA();
}

interfaca B
{
	void showB();
}

class C implements A, B
{
	@Override
	public void showA {
		
		System.out.print("Hello A ");
		
	}
}