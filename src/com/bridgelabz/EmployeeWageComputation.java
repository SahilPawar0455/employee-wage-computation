package com.bridgelabz;

public class EmployeeWageComputation {
    public static final int EMP_IS_PRESENT_FULL_TIME = 1;
    public static final int EMP_IS_PRESENT_HALF_TIME = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation");
        computeEmployeeWage("TCS", 20, 160, 500);
        computeEmployeeWage("Reliance", 24, 192, 450);
    }

    public static void computeEmployeeWage(String company, int workingDayInMonth, int maxHrInMonth, int perHrRate) {
        int employeeHr = 0;
        int totalEmployeeWage = 0;
        int totalEmployeeHr = 0;
        int totalWorkingDay = 0;
        while (workingDayInMonth > totalWorkingDay && (maxHrInMonth >= totalEmployeeHr)) {
            totalWorkingDay++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case EMP_IS_PRESENT_FULL_TIME:
                    employeeHr = 8;
                    break;
                case EMP_IS_PRESENT_HALF_TIME:
                    employeeHr = 4;
                    break;
                default:
                    employeeHr = 0;
            }
            int employeeWage = perHrRate * employeeHr;
            totalEmployeeWage += employeeWage;
            totalEmployeeHr += employeeHr;
        }
        System.out.println("Company Name is = " + company);
        System.out.println("Employee worked hr in month is : " + totalEmployeeHr);
        System.out.println("Total Wage of Month is : " + totalEmployeeWage);
    }
}
