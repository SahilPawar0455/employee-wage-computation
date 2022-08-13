package com.bridgelabz;

public class EmployeeWageComputation {
    public static final int Emp_Is_Present_Full_Time = 1;
    public static final int Emp_Is_Present_Half_Time = 2;
    public static final int Working_Day_In_Month = 20;
    public static final int Max_Hr_In_Month = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation");
        int perHrRate = 20;
        int employeeHr = 0;
        int totalEmployeeWage = 0;
        int totalEmployeeHr = 0;
        int totalWorkingDay = 0;
        while (Working_Day_In_Month > totalWorkingDay && (Max_Hr_In_Month >= totalEmployeeHr)) {
            totalWorkingDay++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case Emp_Is_Present_Full_Time:
                    System.out.println("Employee is Present in Full Time");
                    employeeHr = 8;
                    break;
                case Emp_Is_Present_Half_Time:
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
        System.out.println("Employee worked hr in month is : "+totalEmployeeHr);
        System.out.println("Total Wage of Month is : " + totalEmployeeWage);
    }
}
