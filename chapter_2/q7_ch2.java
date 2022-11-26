/*
 * Question: write a program that take a number like x and send it to a method,
 * method calculate and return 1/x^2+x+3 then print result.
 */











// Answer:
import java.util.Scanner;
import java.lang.Math;

public class q7_ch2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double x;

        System.out.print("Enter the number:\s");
        x = in.nextDouble();
        System.out.printf("result= %.5f", solver(x));
    }

    public static double solver(double y) {
        y = 1 / (Math.pow(y, 2) + y + 3);
        return y;
    }
}