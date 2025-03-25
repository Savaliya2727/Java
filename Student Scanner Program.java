import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the roll no:- ");
			int rollno = sc.nextInt();
		
			System.out.println("Enter the name of student:- ");
			String name = sc.nextLine();
		
			System.out.println("Enter total no. of subjects:- ");
			int sub = sc.nextInt();
		
			System.out.println("Enter the total marks obtained:- ");
			int obtmarks = sc.nextInt();
		
			System.out.println("Enter the total no. of marks:- ");
			int totalmarks = sc.nextInt();
		
			int perc = obtmarks/totalmarks*100;
		
			System.out.println("Your Rollno:-" + rollno);
			System.out.println("Your name: " + name);
			System.out.println("Your total subjects:- "+ sub);
			System.out.print("Your percentage:- "+ perc);

		}

}
