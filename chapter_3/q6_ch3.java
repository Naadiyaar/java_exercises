/*
 * Question: write a program that prints n terms of fibonacci series.
 */

















// Answer:
import java.util.Scanner;

public class q6_ch3 {
    static Scanner in = new Scanner(System.in);

    public static void fibo(int x) {
        int n1 = 1, n2 = 1,holder;
        System.out.print(n1 + " ");
        System.out.print(n1 + " ");

        for (int i = 0; i < x - 2; i++) {
            holder = n2;
            n2 += n1;
            n1 = holder;
            System.out.print(n2 + " ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number of series you want to check: ");
        fibo(in.nextInt());
    }
}

// more efficient Answer found here: https://www.geeksforgeeks.org/different-ways-to-print-fibonacci-series-in-java/
// Dynamic Programming approach for
// Fibonacci Series

// class fibonacci {

// 	// Function to find the fibonacci Series
// 	static int fib(int n)
// 	{

// 		// Declare an array to store
// 		// Fibonacci numbers.
// 		// 1 extra to handle case, n = 0
// 		int f[] = new int[n + 2];

// 		int i;

// 		// 0th and 1st number of
// 		// the series are 0 and 1
// 		f[0] = 0;
// 		f[1] = 1;

// 		for (i = 2; i <= n; i++) {

// 			// Add the previous 2 numbers
// 			// in the series and store it
// 			f[i] = f[i - 1] + f[i - 2];
// 		}

// 		// Nth Fibonacci Number
// 		return f[n];
// 	}

// 	public static void
// 	main(String args[])
// 	{
// 		// Given Number N
// 		int N = 10;

// 		// Print first 10 term
// 		for (int i = 0; i < N; i++)
// 			System.out.print(fib(i) + " ");
// 	}
// }