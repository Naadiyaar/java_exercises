/*
 * Question: write a program that get working hours and salary per hour 
 * of an employee and calculate his income with and without 10% tax.
 */
















// Answer:
import java.util.Scanner;

public class q2_ch2 {
    // call scanner method to be able to get input from user
    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
        double working_hour, wage_hour, salary_before_tax, salary_after_tax;
        // ask user to give enter info
        System.out.print("How many hours do you work per day?\s");
        working_hour = input.nextDouble();
        System.out.print("How mauch do you get per hour?\s");
        wage_hour = input.nextDouble();

        // calculate salary before and after 10% tax
        salary_before_tax = working_hour * wage_hour;
        salary_after_tax = salary_before_tax - (10 * salary_before_tax / 100);

        System.out.println();

        System.out.println("your income before calculating tax is: " + salary_before_tax);
        System.out.println("your salary is: " + salary_after_tax);
    }
}
