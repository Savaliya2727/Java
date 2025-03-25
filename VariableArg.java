
public class VariableArg {

	public static void main (String[] args) {
		
		A a = new A();
		a.add("MCA",4,4,5,6,7,8,9);

	}
	
}

class A
{
	void add(String a, int...b)  // (String a, int...b) Variable uesd
	{
		for(var no : b)
		{
			System.out.println(no);
		}
		System.out.println(a);
	}
}
