import java.util.Scanner;
public class integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Sem : ");
		int semno = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter your Stream : ");
		String sname = sc.nextLine();
		
		System.out.print(semno + " " +sname);
	}

}

