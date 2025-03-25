import java.util.Scanner;
class Multable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter tour number = ");
			int num = scan.nextInt();
			
			for(int i=1;i<=num;i++);
			{
				System.out.print(num+"*"+i+"="+(num*1));
			}
	}

}
