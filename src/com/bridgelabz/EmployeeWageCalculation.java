package com.bridgelabz;

public class EmployeeWageCalculation {
	static int IS_FULL_TIME = 1;
	static int PART_TIME = 2;
	static int ABSENT = 0;
	double empCheck;
	int empHrs;
	int empWage = 0;
	static int Emp_Rate_Per_Hour = 20;

	public void monthly_Wage_Calculation() {
		for (int i = 0; i < 20; i++) {
			double empCheck = Math.floor(Math.random() * 3);
			switch ((int) empCheck) {
			case 0: {
				empHrs = 0;
				break;
			}
			case 1: {
				empHrs = 16;
				break;
			}
			case 2: {
				empHrs = 8;
				break;
			}
			}

			empWage += (empHrs * Emp_Rate_Per_Hour);

		}
		System.out.println("Total monthly emp wage is : " + empWage);

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee\r\n" + "Wage Computation\r\n" + "Program on Master Branch");
		EmployeeWageCalculation obj = new EmployeeWageCalculation();
		obj.monthly_Wage_Calculation();
	}

}
