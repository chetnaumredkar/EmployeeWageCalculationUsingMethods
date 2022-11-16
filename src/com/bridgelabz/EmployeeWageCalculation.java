package com.bridgelabz;

import java.lang.Math;

import java.util.Scanner;

public class EmployeeWageCalculation {
	 public static final int IS_FULL_TIME = 1;
	 public static final int PART_TIME = 2;
	private int empHrs;
	private int a;
	private int empHrsTotal = 0;
	private int empWage = 0;
	private static int Emp_Rate_Per_Hour ;
	private int working_Hours_Per_Month;
	private int No_Of_Working_Days;
	pri
	
	public void monthly_Conditional_Wage_Calculation() {
		int empHrs=0;int a;int empWage = 0;
		while (a < No_Of_Working_Days )  {

			double empCheck = Math.floor(Math.random() * 3);
			a++;
			
			switch ((int)empCheck) {
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
			if(empHrsTotal == working_Hours_Per_Month) {
				break;
			}
			
			
		}
		empWage = empHrsTotal * Emp_Rate_Per_Hour;
		System.out.println(a);
		System.out.println("Total working hours" + empHrsTotal);
		System.out.println("The total income of an employee in a month is " + empWage);

	}
	public class Company1{
		monthly_Conditional_Wage_Calculation();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee\r\n" + "Wage Computation\r\n" + "Program on Master Branch");
		EmployeeWageCalculation company1obj = new EmployeeWageCalculation;
	//	company1.monthly_Conditional_Wage_Calculation();
		EmployeeWageCalculation company2obj = new EmployeeWageCalculation;
		//company2.monthly_Conditional_Wage_Calculation();
		EmployeeWageCalculation company3obj = new EmployeeWageCalculation;
			//	company3.monthly_Conditional_Wage_Calculation();

	}

}
