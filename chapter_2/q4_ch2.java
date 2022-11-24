/*
 * Question: write a program thar recive time 
 * spent for an event in seconds and prnt 
 * it in form of Hour, minute, and second.
 */













// Answer:
import java.util.Scanner;

public class q4_ch2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        float second;

        System.out.println("Enter time in seconds: ");
        second = input.nextFloat();

        System.out.print("your converted time is => " + "S: " + second + 
        " | M: " + second / 60 + " | H: " + second / 3600);
    }
}
