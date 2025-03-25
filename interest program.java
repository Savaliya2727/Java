import java.util.Scanner;
public class si {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the amount: ");
		int amount = sc.nextInt();
		
		System.out.print("Enter the interest:- ");
		int roi = sc.nextInt();
		
		System.out.print("Enter the time is years:- ");
		int time = sc.nextInt();
		
		int interest = amount*roi*time/100;
		
		System.out.print("The interest for the action is"+ interest );
	}

}
