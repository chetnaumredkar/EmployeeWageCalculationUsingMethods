package com.bridgelabz;

import java.lang.Math;

import java.util.Scanner;

public class EmployeeWageCalculation {
	static int IS_FULL_TIME = 1;
	static int PART_TIME = 2;
	int empHrs;
	int empHrsTotal = 0;
	int empWage = 0;
	static int Emp_Rate_Per_Hour = 20;
	int No_Of_Working_Days;

	public void monthly_Conditional_Wage_Calculation() {
		while (No_Of_Working_Days < 20 )  {

			double empCheck = Math.floor(Math.random() * 3);
			No_Of_Working_Days++;
			
			switch ((int) empCheck) {
			case 1:
				empHrs = 10;
				break;

			case 2:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
				break;
			}
			empHrsTotal += empHrs;
			if(empHrsTotal == 100) {
				break;
			}
			
			
		}
		empWage = empHrsTotal * Emp_Rate_Per_Hour;
		System.out.println(No_Of_Working_Days);
		System.out.println("Total working hours" + empHrsTotal);
		System.out.println("The total income of an employee in a month is " + empWage);

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee\r\n" + "Wage Computation\r\n" + "Program on Master Branch");
		EmployeeWageCalculation obj = new EmployeeWageCalculation();
		obj.monthly_Conditional_Wage_Calculation();
	}

}
