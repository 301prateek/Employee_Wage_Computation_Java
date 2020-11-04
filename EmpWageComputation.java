import java.util.*;
import java.util.HashMap;
import java.util.Random;
public class EmpWageComputation{

	public static int wages(int wage, int days, int hrs, String company) {

		int fullTime = 8;
		int partTime = 4;

		int sum1 = 0;
		int totalDays = 0;
		int totalHrs  = 0;

		while(true) {
			Random r = new Random();
			int c  = r.nextInt(3);

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
		int wage1 = 16;
		int days1 = 20;
		int hrs1  = 160;	
		String company1 ="Facebook";

		int totalSalary1=wages(wage1,days1,hrs1,company1);

		System.out.println("____________________________");

		int wage2 = 18;
		int days2 = 21;
		int hrs2  = 147;	
		String company2 ="Microsoft";

		int totalSalary2=wages(wage2,days2,hrs2,company2);

		System.out.println("____________________________");
	
		int wage3 = 19;
		int days3 = 20;
		int hrs3  = 120;	
		String company3 ="Google";

		int totalSalary3=wages(wage3,days3,hrs3,company3);

		System.out.println("____________________________");

		int wage4 = 20;
		int days4 = 20;
		int hrs4  = 100;	
		String company4 ="Wipro";

		int totalSalary4=wages(wage4,days4,hrs4,company4);

		System.out.println("____________________________");

		HashMap<String,Integer> com = new HashMap<>();
		com.put(company1,totalSalary1);
		com.put(company2,totalSalary2);
		com.put(company3,totalSalary3);
		com.put(company4,totalSalary4);

		System.out.println(com);
}
}


