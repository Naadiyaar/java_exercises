/*
 * Question: wrte a program that prints summation of number from 1 to n for n between 1 and 50.
 */

// Answer:
class q11_ch3 {
    public static void main(String[] args) {
        int n = 3, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}