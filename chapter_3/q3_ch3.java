/*
 * Question: write a program that takes a number and send it to a method.
 * method check if the number is perfect or not.
 * Perfect Number: https://en.wikipedia.org//wiki/Perfect_number
 * after checking a number, ask user if they want to check another number or not.
 */






















// Answer:
import java.util.Scanner;

public class q3_ch3 {
    static Scanner in = new Scanner(System.in);

    public static boolean perfectCheck(int x) {
        if (x == 1) {
            return false;
        }

        int sum = 1; // because 1 is allways one of factors

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }

        if (sum == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        char checkNum = 'y';
        
        while (checkNum == 'y') {
            System.out.print("enter a number to check: ");
            int number = in.nextInt();

            if (perfectCheck(number)) {
                System.out.println("it is perfect");
            } else {
                System.out.println("it is not perfect");
            }

            System.out.print("do you want to check another number? answer with (y)es or (n)o => ");
            checkNum = in.next(".").charAt(0);
        }
    }
}
