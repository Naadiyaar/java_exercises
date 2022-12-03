/*
 * Question: write a program that takes the coefficients of below quadradic equations from the input, then solve them.
 * 
 * ax^2 + bx + c = 0       x = -b±√b-4ac / 2a
 */











 
// Answer:
import java.util.Scanner;

public class q8_ch3 {
    static Scanner in = new Scanner(System.in);

    public static void rootFinder(double a, double b, double c) {
        double det = b * b - 4 * a * c;

        if (det > 0) {
            double root1, root2;

            root1 = (-b + Math.sqrt(det)) / (2 * a);
            root2 = (-b - Math.sqrt(det)) / (2 * a);

            System.out.printf("first root = %.02f and second root = %.02f", root1, root2);
        } else if (det == 0) {
            double root;

            root = -b / (2 * a);
            System.out.printf("there's only 1 root, and it equals to = %.2f", root);
        } else {
            System.out.print("there is no real root!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter coefficients of quadratic equation ax^2+bx+c=0 in order of => a , b , c");
        double c1 = in.nextDouble();
        double c2 = in.nextDouble();
        double c3 = in.nextDouble();

        if (c1 == 0)
        System.out.println("a can't be 0");
        else
            rootFinder(c1, c2, c3);
    }
}