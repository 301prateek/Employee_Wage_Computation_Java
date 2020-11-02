import java.util.*;

public class EmpWageComputation{

	public void company(String company,int wage, int days , int hoursMonth) {
		Random r = new Random();
		int a  = r.nextInt(3);
		int wagePerHr = wage;
		int fullTime  = 8;
		int partTime  = 4;

		//for daily wage//
		if( a == 1 ) {
			int salary = wagePerHr * fullTime;
			System.out.println("_____Daily Wage_____");
			System.out.println("Company name: "+company+" , "+"Salary: "+salary);
		}
		else if ( a == 2) {
			int salary = wagePerHr * partTime;
			System.out.println("_____Daily Wage_____");
			System.out.println("Company name: "+company+" , "+"Salary: "+salary);
		}
		else {
			System.out.println("Absent");
		}

		//for monthly salary//
		int sum = 0;
		for (int i = 0; i < 20; i++) {
			Random rd = new Random();
			int b  = rd.nextInt(3);

			if( b == 1 ) {
			int salary = wagePerHr * fullTime;
			sum = sum +salary;
			}
			else if ( b == 2) {
				int salary = wagePerHr * partTime;
				sum = sum + salary;

			}
			else {
				int salary = 0;
				sum = sum + salary;
				}
			}
			System.out.println("_____Monthly Wage_____");
			System.out.println("Company name: "+company+" , "+"Salary: "+sum);	


			int sum1 = 0;
			int totalDays = 0;
			int totalHrs  = 0;

			while(true) {
				Random r1 = new Random();
				int c  = r1.nextInt(3);

				if( c == 1 ) {
					int salary1 = wagePerHr * fullTime;
					sum1 = sum1 + salary1;
					totalDays = totalDays + 1;
					totalHrs = totalHrs + 8;

				}
				else if ( c == 2) {
					int salary1 = wagePerHr * partTime;
					sum1 = sum1 + salary1;
					totalDays = totalDays + 1;
					totalHrs = totalHrs + 4;

				}
				else {
					int salary1 = 0;
					sum1 = sum1 + salary1;
					totalDays = totalDays + 0;
					totalHrs = totalHrs + 0;

				}

				if(totalHrs == hoursMonth || totalDays > days) {
					break;
				}
			}
			System.out.println("_____Hours/Days_____");
			System.out.println("Company name: "+company+" , "+"Salary: "+sum1);
			System.out.println("Total Days : "+totalDays+" , "+"Total Hours: "+totalHrs);

		}

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Comapany name: ");
			String company = sc.nextLine();
			System.out.println("Enter wage: ");
			int wage = sc.nextInt();
			System.out.println("Enter total days: ");
			int days = sc.nextInt();
			System.out.println("Enter total hours: ");
			int hoursMonth = sc.nextInt();

			EmpWageComputation emp  = new EmpWageComputation();
			emp.company(company, wage, days, hoursMonth);
		}
}


