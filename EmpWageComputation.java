import java.util.*;

public class EmpWageComputation{

	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");

		Random rd = new Random();
		int a = rd.nextInt(3);

		System.out.println("Random NUmber: "+a);

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

		System.out.println("________________Using Case Statement________________");

		switch(a){

		case 1:
			System.out.println("Present");
			int t1 =8;
			int sal1 =wage_per_hr*t1;
			System.out.println("Salary "+sal1);
			break;
		case 2:
                        System.out.println("Part time");
                        int t2 =4;
                        int sal2 =wage_per_hr*t2;
                        System.out.println("Salary "+sal2);
			break;
		case 0:
                        System.out.println("Absent");
                        int t3 =0;
                        int sal3 =wage_per_hr*t3;
                        System.out.println("Salary "+sal3);
			break;
		default:
			System.out.println("Wrong input");
		}


		System.out.println("_______________Month salary__________________");
		int sum = 0;

		for( int i=0; i<20; i++ ){

		int b = rd.nextInt(3);

			if(b == emp_present){
        	                System.out.println("Present");
                	        int time = 8;
                        	int salary = wage_per_hr*time ;
                        	sum = sum + salary;

                	}
                	else if(b == emp_part_time){
                        	System.out.println("Part time");
                        	int time = 4;
                        	int salary = wage_per_hr*time ;
                        	sum = sum + salary;

                	}
                	else{
                        	System.out.println("Absent");
                        	int time = 0;
                       		int salary = wage_per_hr*time ;
                        	sum = sum + salary;
                	}

		}
		System.out.println("This Months salary: "+sum);

		System.out.println("_________Calculation for 20 days or 100 hours__________");

			int sum1  = 0;
			int hours = 0;
			int days  = 0;


                  	while(true){

				int c = rd.nextInt(3);

	                        if(c == emp_present){

        	                        int time = 8;
					hours = hours+time;
                                	int salary = wage_per_hr*time ;
                                	sum1 = sum1 + salary;
					days++;

                        	}
                        	else if(c == emp_part_time){

                                	int time = 4;
					hours = hours+time;
                	                int salary = wage_per_hr*time ;
                                	sum1 = sum1 + salary;
					days++;
                        	}
                        	else{

                                	int time = 0;
                                	int salary = wage_per_hr*time ;
                                	sum1 = sum1 + salary;
					days++;
                        	}
				if( days == 20 || hours == 100 ){
					break;
				}

                }
		System.out.println("This Months salary: "+sum1);
		System.out.println("No of days: "+days);
		System.out.println("No of Hours: "+hours);
	}
}
