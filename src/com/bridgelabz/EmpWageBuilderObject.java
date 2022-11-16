package com.bridgelabz;

public class EmpWageBuilderObject {
	public static final int IS_FULL_TIME = 1;
	public static final int PART_TIME = 2;
	private String comp;
	private static int Emp_Rate_Per_Hour;
	private int working_Hours_Per_Month;
	private int No_Of_Working_Days;
	private int TotalEmpWage = 0;

	public EmpWageBuilderObject(String comp, int working_Hours_Per_Month, int no_Of_Working_Days,
			int Emp_Rate_Per_Hour) {
		super();
		this.comp = comp;
		this.working_Hours_Per_Month = working_Hours_Per_Month;
		this.No_Of_Working_Days = no_Of_Working_Days;
		this.Emp_Rate_Per_Hour = Emp_Rate_Per_Hour;
	}

	public void monthly_Conditional_Wage_Calculation() {
		int empHrs = 0;
		int a = 0;
		int empWage = 0;
		int empHrsTotal = 0;
		while (a < No_Of_Working_Days) {

			double empCheck = Math.floor(Math.random() * 3);
			a++;

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
			if (empHrsTotal == working_Hours_Per_Month) {
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
		EmpWageBuilderObject company1 = new EmpWageBuilderObject("Vodafone", 20, 30, 12);
		company1.monthly_Conditional_Wage_Calculation();
		EmpWageBuilderObject company2 = new EmpWageBuilderObject("ESS", 10, 50, 15);
		company2.monthly_Conditional_Wage_Calculation();
		EmpWageBuilderObject company3 = new EmpWageBuilderObject("Colgate", 30, 60, 130);
		company3.monthly_Conditional_Wage_Calculation();
	}
}