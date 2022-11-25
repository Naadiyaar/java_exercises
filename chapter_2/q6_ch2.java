/*
 * Question: write a progeram that take 5 float number with 5 decimal points each.
 * then calculate thier mean and print each number with 2 decimal points and thier 
 * mean with 3 decimal points in maximum.
 */











// Answer:
import java.util.Scanner;
public class q6_ch2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double[] nums = new double[5];
        double sum = 0, mean;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("enter %dth number:\s", i);
            nums[i-1] = in.nextDouble();
            System.out.println();
        }

        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
        }
        mean = sum / 5;

        System.out.printf("mean = %.3f | 1th number = %.2f | 2th number = %.2f | 3th number = %.2f | 1th number = %.2f | 1th number = %.2f", 
        mean, nums[0], nums[1], nums[2], nums[3], nums[4]);
    }
    
} 