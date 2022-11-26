/*
 * Question: write a program that get a book's price and it 
 * discount percentage then calculate its final price.
 * write it uisng one method
 */











// Answer:
import java.util.Scanner;

public class q9_ch2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int price, discount;

        System.out.print("enter book's price >\s");
        price = in.nextInt();
        System.out.print("enter book's discount >\s");
        discount = in.nextInt();

        System.out.println("\nfinal price is\s" + final_price(price, discount));
    }

    public static double final_price(double p, double d){
        return p - (p * d / 100);
    }
}