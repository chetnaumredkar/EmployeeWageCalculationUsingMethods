package com.bridgelabz;

public class EmployeeWageCalculation {
	static int IS_FULL_TIME = 1;
	static int PART_TIME = 2;
	static int ABSENT = 0;
	double empCheck;
	int empHrs;
	int empWage = 1;
	static int Emp_Rate_Per_Hour = 20;

	public void attendence() {
		empCheck = Math.floor(Math.random() * 3);
		System.out.println(empCheck);
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
		} else if (empCheck == ABSENT) {
			System.out.println("Employee is not Present");
		} else {
			System.out.println("Employee Present For Half Day");
		}
	}

	public void switch_Daily_Employee_Wage() {
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
		empWage = empHrs * Emp_Rate_Per_Hour;
		System.out.println("emp wage: " + empWage);

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee\r\n" + "Wage Computation\r\n" + "Program on Master Branch");
		EmployeeWageCalculation obj = new EmployeeWageCalculation();
		obj.attendence();
		obj.switch_Daily_Employee_Wage();
	}

}
