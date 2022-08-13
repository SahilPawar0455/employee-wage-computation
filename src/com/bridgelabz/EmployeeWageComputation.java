package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation");
        int empIsPresent = 1;
        int perHrRate = 20;
        int fullDayHr = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == empIsPresent) {
            System.out.println("Employee is Present");
            fullDayHr = 8;
        } else {
            System.out.println("Employee is Absent");
        }
        int employeeWage = perHrRate * fullDayHr;
        System.out.println("Employee wage is "+employeeWage);
    }
}
