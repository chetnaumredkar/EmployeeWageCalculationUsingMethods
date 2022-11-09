package com.bridgelabz;

import java.lang.Math;

import java.util.Scanner;

public class EmployeeWageCalculation {
	static double IS_FULL_TIME = 1;
	static double PART_TIME = 2;
	int empHrs;
	int a;
	int empHrsTotal = 0;
	int empWage = 0;
	static int Emp_Rate_Per_Hour ;
	int working_Hours_Per_Month;
	int No_Of_Working_Days;
	EmployeeWageCalculation(int No_Of_Working_Days,int Emp_Rate_Per_Hour,int working_Hours_Per_Month){
		this.No_Of_Working_Days=No_Of_Working_Days;
		this.Emp_Rate_Per_Hour=Emp_Rate_Per_Hour;
		this.working_Hours_Per_Month=working_Hours_Per_Month;
	}
	public void monthly_Conditional_Wage_Calculation() {
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

	public static void main(String[] args) {
		System.out.println("Welcome to Employee\r\n" + "Wage Computation\r\n" + "Program on Master Branch");
		EmployeeWageCalculation company1 = new EmployeeWageCalculation(20, 30, 120);
		company1.monthly_Conditional_Wage_Calculation();
		EmployeeWageCalculation company2 = new EmployeeWageCalculation(10, 50, 150);
		company2.monthly_Conditional_Wage_Calculation();
		EmployeeWageCalculation company3 = new EmployeeWageCalculation(30, 60, 130);
		company3.monthly_Conditional_Wage_Calculation();

	}

}
