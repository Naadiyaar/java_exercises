/*
 * Question: write a program that get the amount of money in the bank account
 * with its annual percentage yield and return the amount of money in the end of year.
 */















// Answer:
import java.util.Scanner;

public class q10_ch2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int money, apy;
        double finalM;

        System.out.print("Enter the amount of Money in account >\s");
        money = in.nextInt();
        System.out.print("Enter account APY >\s");
        apy = in.nextInt();

        finalM = money + (money * apy / 100);
        System.out.print("\nYou will have " + finalM + "$ in your account");
    }
    
}