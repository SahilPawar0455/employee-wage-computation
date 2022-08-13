package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation");
        int empIsPresentFullTime = 1;
        int empIsPresentHalfTime = 2;
        int perHrRate = 20;
        int employeeHr = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == empIsPresentFullTime) {
            System.out.println("Employee is Present in Full Time");
            employeeHr = 8;
        } else if (empCheck == empIsPresentHalfTime) {
            System.out.println("Employee is present in Half Time");
            employeeHr = 4;
        } else {
            System.out.println("Employee is Absent");
        }
        int employeeWage = perHrRate * employeeHr;
        System.out.println("Employee wage is "+employeeWage);
    }
}
