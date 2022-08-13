package com.bridgelabz;

public class EmployeeWageComputation {
    public static final int Emp_Is_Present_Full_Time = 1;
    public static final int Emp_Is_Present_Half_Time = 2;
    public static final int Working_Day_In_Month = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation");
        int perHrRate = 20;
        int employeeHr = 0;
        int totalEmployeeWage = 0;
        for (int i = 0; i < Working_Day_In_Month; i++) {
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
        }
        System.out.println("Total Wage of Month is : " + totalEmployeeWage);
    }
}
