/*
 * Question: write a program that find and print perfect numbers between 1 and 100
 * find perfect numbers using a method
 */










 
// Answer:
class q12_ch3 {
    public static boolean perfectNumberFinder(int x) {
        int sum = 1;

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }

        if (sum == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (perfectNumberFinder(i)) {
                System.out.println(i);
            }
        }
    }
}