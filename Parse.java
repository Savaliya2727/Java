import java.util.Scanner;
class Parse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Roll no :-");
		int rno = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter yout Name :-");
		String name = sc.nextLine();
		
		System.out.print("Roll no:- "+rno+" "+"Name:-  "+name);
		
		sc.close();
	}

}
