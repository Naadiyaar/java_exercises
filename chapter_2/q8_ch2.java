/*
 * Question: write a program that get Lenth and Width of a land in shape of 
 * a rectangle and also get the price per square meter and send them to a method
 * then method caclulate overall price of land and return it.
 * 
 * also rewrite this program without using any method(use main only)
 */

// Answer first way:
// import java.util.Scanner;

// public class q8_ch2 {
//     static Scanner in = new Scanner(System.in);

//     public static void main(String[] args) {
//         double lenth, width, pricePerMeter, totalPrice;

//         System.out.print("Enter Lenth:\s");
//         lenth = in.nextDouble();
//         System.out.print("Enter Width:\s");
//         width = in.nextDouble();
//         System.out.print("Enter price per meter:\s");
//         pricePerMeter = in.nextDouble();

//         totalPrice = multiplier(lenth, width, pricePerMeter);
//         System.out.println("land price is:\s" + totalPrice);
//     }

//     public static double multiplier(double l, double w, double p) {
//         return l * w * p;
//     }
// }

// Answer Second way:
import java.util.Scanner;

public class q8_ch2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double lenth, width, pricePerMeter;

        System.out.print("Enter Lenth:\s");
        lenth = in.nextDouble();
        System.out.print("Enter Width:\s");
        width = in.nextDouble();
        System.out.print("Enter price per meter:\s");
        pricePerMeter = in.nextDouble();

        System.out.println("land price is:\s" + lenth * width * pricePerMeter);
    }
}