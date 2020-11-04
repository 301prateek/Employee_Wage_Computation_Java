import java.util.*;

public class EmpWageComputation implements Salary {

	
	@Override
	public int dailySalary(int wage) {
    
        int wage_per_hr = wage;

        Random rd = new Random();
        int a = rd.nextInt(3);
        
        if(a == 1){
                int time = 8;
                int salary = wage_per_hr*time ;
                return salary;

        }
        else if(a == 2){
                int time = 4;
                int salary = wage_per_hr*time ;
                return salary;
        }
        else{
                int time = 0;
                int salary = wage_per_hr*time ;
                return salary;
        }
	}
	
	@Override
	public int getSalary(int wage, int days, int hrs, String company) {

			int fullTime = 8;
			int partTime = 4;

			int sum1 = 0;
			int totalDays = 0;
			int totalHrs  = 0;

			while(true) {
				Random r1 = new Random();
				int c  = r1.nextInt(3);
	
				if(totalDays == days || totalHrs >= hrs) {
					break;
				}

				if( c == 1 ) {
					int salary1 = wage* fullTime;
					sum1 = sum1 + salary1;
					totalDays = totalDays + 1;
					totalHrs = totalHrs + 8;

				}
				else if ( c == 2) {
					int salary1 = wage * partTime;
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

			}
System.out.println("_____Salary_____");
System.out.println("Company name: "+company+" , "+"Salary: "+sum1);
System.out.println("Total Days : "+totalDays+" , "+"Total Hours: "+totalHrs);
return sum1;
}



	public static void main(String[] args) {
		
		EmpWageComputation emp = new EmpWageComputation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details and Company To get Total Salary: ");
		
		System.out.println("Enter wage per hour: ");
		int wage = sc.nextInt();
		
		System.out.println("Enter total days: ");
		int days = sc.nextInt();
		
		System.out.println("Enter total hours: ");
		int hrs  = sc.nextInt();
		
		System.out.println("Enter Company name: ");
		String company = sc.nextLine();

		int dailySalary=emp.dailySalary(wage);
		int totalSalary=emp.getSalary(wage,days,hrs,company);
			
		System.out.println("____________________________");
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(totalSalary);
		
		System.out.println("Total Salary");
		for(int k : ar) {
			System.out.println(k);
		}
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(dailySalary);
		
		System.out.println("Daily Salary");
		for(int j : arr) {
			System.out.println(j);
		}
	}

}
