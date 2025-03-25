import java.util.Scanner;
public class GetValue
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Student name :-");
		String name = sc.nextLine();
		
		System.out.print("Enter your First Number :- ");
		int no1 = sc.nextInt();
		
		System.out.print("Enter your Second Number :-");
		int no2 = sc.nextInt();
		
		System.out.print(name);
		System.out.print(no1+no2);
	}
}