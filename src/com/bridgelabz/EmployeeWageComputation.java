package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation");
        int empIsPresent = 1;
        double empCheck = Math.floor(Math.random()*10)%2;
        if (empCheck == empIsPresent){
            System.out.println("Employee is Present");
        }else {
            System.out.println("Employee is Absent");
        }
    }
}
