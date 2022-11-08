package com.bridgelabz;

public class EmployeeWageCalculation {
	static int IS_FULL_TIME = 1;
	static int PART_TIME = 0;
	double empCheck;
	int empHrs;
	int empWage = 1;
	static int Emp_Rate_Per_Hour = 20;

	public void attendence() {
		empCheck = Math.floor(Math.random() * 2);
		System.out.println(empCheck);
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is not Present");
		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee\r\n" + "Wage Computation\r\n" + "Program on Master Branch");
		EmployeeWageCalculation obj = new EmployeeWageCalculation();
		obj.attendence();
	}

}
