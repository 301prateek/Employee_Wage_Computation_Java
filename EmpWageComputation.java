import java.util.*;

public class EmpWageComputation{

	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");

		Random rd = new Random();
		int a = rd.nextInt(2);

		System.out.println(a);

		int emp_present = 1;
		int emp_absent  = 0;

		if(a == emp_present){
			System.out.println("Employee Present");
		}
		else{
			System.out.println("Employee Absent");

		}
	}
}
