
public class superkey {
	public static void main(String[] aeg) {
		
		C cobj = new C();
		cobj.showStudentName();
		
	}
}

class A
{
	void showCollegeName() 
	{
		System.out.println("My College Name : Jg University");
	}
}

class B extends A
{
	void showSteamName()
	{
		super.showCollegeName();
		System.out.println("Stream Name : IMCA");
	}
}

class C extends B
{
	void showStudentName()
	{
		super.showSteamName();
		System.out.println("Student Name is : prince");
	}
}




