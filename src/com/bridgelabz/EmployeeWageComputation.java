package com.bridgelabz;

public class EmployeeWageComputation {
    public static final int EMP_IS_PRESENT_FULL_TIME = 1;
    public static final int EMP_IS_PRESENT_HALF_TIME = 2;
    public static final int WORKING_DAY_IN_MONTH = 20;
    public static final int MAX_HR_IN_MONTH = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation");
        computeEmployeeWage();
    }
    public static void computeEmployeeWage(){
        int perHrRate = 20;
        int employeeHr = 0;
        int totalEmployeeWage = 0;
        int totalEmployeeHr = 0;
        int totalWorkingDay = 0;
        while (WORKING_DAY_IN_MONTH > totalWorkingDay && (MAX_HR_IN_MONTH >= totalEmployeeHr)) {
            totalWorkingDay++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case EMP_IS_PRESENT_FULL_TIME:
                    System.out.println("Employee is Present in Full Time");
                    employeeHr = 8;
                    break;
                case EMP_IS_PRESENT_HALF_TIME:
                    System.out.println("Employee is present in Half Time");
                    employeeHr = 4;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    employeeHr = 0;
            }
            int employeeWage = perHrRate * employeeHr;
            System.out.println("Employee wage is " + employeeWage);
            totalEmployeeWage += employeeWage;
            totalEmployeeHr += employeeHr;
        }
        System.out.println("Employee worked hr in month is : " + totalEmployeeHr);
        System.out.println("Total Wage of Month is : " + totalEmployeeWage);
    }
}
