package com.plurasight;

import java.util.Scanner;

public class CD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the CD Calculator!");

        System.out.println("Please Enter Your Deposit Amount: ");
        double amount = input.nextDouble();

        System.out.print("Please Enter Your Desired Interest Rate: ");
        double interest  = input.nextDouble();

        System.out.print("How many years: ");
        int years = input.nextInt();

        //* Example: If you deposit $1,000 in a CD that earns 1.75%
        //interest and matures in 5 years, your CD's ending balance will
        //be $1,092.62 and you would have earned $92.62 in interest

        //Note: The numbers above assume daily compounding

        //FV = P × (1 + (r / 365))^(365 × t)
        //• Future Value (FV)
        //• Principal (P): This is the initial deposit amount.
        //• Annual Interest Rate (r): The nominal annual interest rate in decimal form
        //(e.g., 1.75% = 0.0175).
        //• Number of Years (t): The total number of years the deposit will earn interest.
        //• Days Per Year: Daily compounding assumes 365 days per year.
        //• Total Number of Days: This is 365 × t (because there are 365 days per year).
        //• Total Interest Earned = FV - P

        double r = interest / 100;
        double futureValue = amount *Math.pow(1+(r/365),365 * years);
        double interestEarned = futureValue - amount;

        System.out.printf("A $%.2f deposit at %.2f%% interest for %d years will grow to $%.2f\n", amount,interest, years, futureValue);
        System.out.printf("Total interest earned: $%.2f\n", interestEarned);
    }
}
