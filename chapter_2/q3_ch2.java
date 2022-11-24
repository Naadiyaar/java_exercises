// Question: write program that get 
// lenth of altitude and base of a 
// triangle as input and calculate the area.















// Answer:
import java.util.Scanner;
public class q3_ch2 {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double altitude, base, area;
        
        // get inputs
        System.out.print("Please enter altitude lenth in cm: ");
        altitude = console.nextDouble();

        System.out.print("Please enter base line lenth in cm: ");
        base = console.nextDouble();

        area = 0.5 * altitude * base;

        System.out.println("the tiangle area is equal to: " + area + "cm");

    }
}