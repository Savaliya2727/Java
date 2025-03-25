
public class staticDemo {
	public static void main(String[] arg) {
		
		// A.name = "Hello MCA";
		
		// System.out.print("A.name);
		
		A.showmsg(); //CALLED FUNTION
		System.out.println(A.name); // CALLED VARIABLE
		
	}
}

class A
{
	static String name = "MCA";
	
	static void showmsg()
	{
		System.out.println(name);
	}
}