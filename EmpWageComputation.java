import java.util.*;

public class EmpWageComputation{

	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");

		Random rd = new Random();
		int a = rd.nextInt(3);

		System.out.println(a);

		int emp_present = 1;
		int emp_absent  = 0;
		int wage_per_hr =20;
		int emp_part_time = 2;

		if(a == emp_present){
			System.out.println("Employee Present");
			int time = 8;
			int salary = wage_per_hr*time ;
			System.out.println("Daily salary: "+salary);

		}
		else if(a == emp_part_time){
			System.out.println("Employee Present Part time");
			int time = 4;
			int salary = wage_per_hr*time ;
			System.out.println("Daily salary: "+salary);
		}
		else{
                        System.out.println("Employee Absent");
                        int time = 0;
                        int salary = wage_per_hr*time ;
                        System.out.println("Daily salary: "+salary);
		}

		System.out.println("=========Using Case Statement============");

		switch(a){

		case 1:
			System.out.println("Employee Present");
			int t1 =8;
			int sal1 =wage_per_hr*t1;
			System.out.println("Salary "+sal1);
			break;
		case 2:
                        System.out.println("Employee Present Part time");
                        int t2 =4;
                        int sal2 =wage_per_hr*t2;
                        System.out.println("Salary "+sal2);
			break;
		case 0:
                        System.out.println("Employee Absent");
                        int t3 =0;
                        int sal3 =wage_per_hr*t3;
                        System.out.println("Salary "+sal3);
			break;
		default:
			System.out.println("Wrong input");
		}
	}
}
