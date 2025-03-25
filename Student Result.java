import java.util.Scanner;
public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the college name : ");
		String college = sc.nextLine();
		
		System.out.print("Enter the Stream name : ");
		String stream = sc.nextLine();
		
		System.out.print("En no : ");
		int eNo = sc.nextInt();
		
		// SUBJECT NAME PRINT
		
		System.out.println("Subject 1 name : ");
		String s1 = sc.nextLine();
		
		System.out.println("Subject 2 name : ");
		String s2 = sc.nextLine();
		
		System.out.println("Subject 3 name : ");
		String s3 = sc.nextLine();
		
		System.out.println("Subject 4 name : ");
		String s4 = sc.nextLine();
		
		System.out.println("Subject 5 name : ");
		String s5 = sc.nextLine();
		
		System.out.println("Subject 6 name : ");
		String s6 = sc.nextLine();
		
		// SUBJECT MARKS PRINT
		
		System.out.print("Subject 1 Marks : ");
		int m1 = sc.nextInt();
		
		System.out.print("Subject 2 Marks : ");
		int m2 = sc.nextInt();
		
		System.out.print("Subject 3 Marks : ");
		int m3 = sc.nextInt();
		
		System.out.print("Subject 4 Marks : ");
		int m4 = sc.nextInt();
		
		System.out.print("Subject 5 Marks : ");
		int m5 = sc.nextInt();
		
		System.out.print("Subject 6 Marks : ");
		int m6 = sc.nextInt();
		
		System.out.print("Subject All Total Marks : ");
		System.out.print(m1+m2+m3+m4+m5+m6/100 + "%");
		
		
	}

}
