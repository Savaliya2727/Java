import java.util.Scanner;
public class TaskClass {
	
	public static void main(String[] arg) {
		
		car obj = new car();
		
		obj.colour();
		obj.price();
		obj.model();
		obj.type();
		obj.EngineNo();
		obj.companyName();
		
	}
	
}

class vehicle
{
	Scanner scan = new Scanner(System.in);
	
	void colour()
	{
		System.out.print("Enter your colour : ");
		String colour = scan.nextLine();
		
		System.out.println("Colour :- "+colour);
	}
	
	void price()
	{
		System.out.print("Enter your Price : ");
		long price = scan.nextLong();
		
		System.out.println("Price :- "+price);
	}
	
	void model()
	{
		System.out.print("Enter your Model : ");
		String model = scan.nextLine();
		
		System.out.println("Model :- "+model);
	}
}

class car extends vehicle
{
	void type()
	{
		System.out.print("Enter your type : ");
		String type = scan.nextLine();
		
		System.out.println("Type :- "+type);
	}
	
	void EngineNo()
	{
		System.out.print("Enter your Engine No : ");
		int engineNo = scan.nextInt();
		
		System.out.println("Engine No :- "+engineNo);
	}
	
	void companyName()
	{
		System.out.print("Enter your Company Name : ");
		String company = scan.nextLine();
		
		System.out.println("Company Name :- "+company);
	}
}