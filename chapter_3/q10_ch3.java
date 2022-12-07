/*
 * Question: wite a program that prints number from 1 to 25 and thier square
 * numbers shoud be in one raw and thier square in another raw
 */

// Answer:
public class q10_ch3 {
    public static void main(String[] args) {
        System.out.println("Number | Square");
        for (int i = 1; i <= 25; i++) {
            System.out.printf("%d | %d%n", i, i * i);
        }
    }
}