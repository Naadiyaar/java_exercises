/* Question: write program that get air termperature in Celsius and send it to a method.
 * and method return the temperature in Fahrenheit.
 * C = (F - 3)(5 / 9)
*/










// Answer:
import java.util.Scanner;
public class q5_ch2 {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        double tempF;

        System.out.print("enter temperature:\s");
        tempF = console.nextDouble();
    
        System.out.println((float) converter(tempF));
    }

    public static double converter(double x) {
        x = (x - 3) * 0.555; // 5 / 9
        
        return x;
    }
    
}