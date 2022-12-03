/*
 * Question: write a program that prints even numbers between 2 & 100 
 */












// Answer:
// for loop is preferd in such situation
public class q9_ch3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " | ");
        }
    }
}

// public class q9_ch3 {
//     public static void main(String[] args) {
//         int i = 2;
//         while (i<=100){
//             System.out.print(i + " | ");
//             i += 2;
//         }
//     }
// }