/*
 * Question: write a program that takes number of week days from user
 * and print the equivalent day of that number in the output. (use switch)
 */

// Answer:
import java.util.Scanner;

public class q7_ch3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number of the day => ");
        int numDay = in.nextInt();

        switch (numDay) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sonday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednsday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
            System.out.println("Please enter a number between 1 & 7");
                break;
        }
    }
}