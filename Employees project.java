import java.util.Scanner;
class Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Company Name :-");
		String c_name = sc.nextLine();
		
		System.out.print("Enter your Employee ID :- ");
		int e_id = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter your Designation Name :- ");
		String d_name = sc.nextLine();
		
		System.out.print("Enter your Employee Name :- ");
		String e_name = sc.nextLine();

		System.out.print("Enter your Employee's joining date :- ");
		String date = sc.nextLine();
				
		System.out.print("Enter Employee's year of experience :- ");
		int exp = sc.nextInt();
		
		System.out.print("Enter your Employees Salary:- ");
		int b_salary = sc.nextInt();
		
		float T_allow = ((b_salary*5)/100);
		double M_allow = ((b_salary*2.5)/100);
		double sal_after_allow = b_salary+T_allow+M_allow;
		
		double p_fund = ((sal_after_allow*7)/100);
		double Gross_salary = sal_after_allow-p_fund;
		
		double tax = ((Gross_salary*5.5)/100);
		
		double Net_salary = Gross_salary-tax;
		
		sc.close();
		
		System.out.println("===========================================");
		
		System.out.println("        "+c_name);
		
		System.out.println("============================================");
		
		System.out.println("Emp ID:- "+e_id+"     "+"Designation:-  "+d_name);
		System.out.println("Emp name:-  "+e_name+"   "+"Joining date:-   "+date);
		System.out.println("Salary:-  "+b_salary+"    "+"Expreience:-  "+exp);
		
		System.out.println("============================================");
		
		System.out.println("Travel allowance(5%):-  "+T_allow);
		System.out.println("Medical allowance(2.5%):-  "+M_allow);
		System.out.println("Salary after allowance:-  "+sal_after_allow);
		
		System.out.println("============================================");
		
		System.out.println("Provident Fund(7%):-  "+p_fund);
		System.out.println("Gross salary:-  "+Gross_salary);
		System.out.println("-Incpme tax:-  "+tax);
	
		System.out.println("============================================");
		
		System.out.println("Net salary:-  "+Net_salary);
		
		System.out.println("============================================");
		
	}

}









