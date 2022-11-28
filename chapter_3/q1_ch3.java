/*
 * Question: write a program that prduce below output:
 * 
 *                             *
 *                             * *
 *                             * * *
 *                             * * * *
 *                             * * * * *
 *                             * * * * * *
 */

















// Answer:
public class q1_ch3 {
    public static void main(String[] args) {
        String star = "* ";

        for (int i = 1; i <= 6; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(star);
            }

            System.out.println();
        }
    }
}

// upside down
// public class q1_ch3{
// public static void main(String[] args){
// String star = "* ";

// for (int i = 1; i <= 6; i++){
// for (int j = i; j <= 6; j++) {
// System.out.print(star);
// }

// System.out.println();
// }
// }
// }

// cool solution from https://www.edureka.co/blog/30-pattern-programs-in-java/
// public class q1_ch3 {
//     public static void rightTriangle(int n) {
//         int i, j;
//         for (i = 0; i < n; i++) // outer loop for number of rows(n)
//         {
//             for (j = 2 * (n - i); j >= 0; j--) // inner loop for spaces
//             {
//                 System.out.print(" "); // printing space
//             }
//             for (j = 0; j <= i; j++) // inner loop for columns
//             {
//                 System.out.print("* "); // print star
//             }
//             System.out.println(); // ending line after each row
//         }
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         rightTriangle(n);
//     }
// }