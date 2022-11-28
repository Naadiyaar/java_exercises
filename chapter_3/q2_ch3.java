/*
 * Question; write a program that produce below output:
 * 
 *                                     *
 *                                    * *
 *                                   * * *
 *                                  * * * *
 *                                 * * * * *                                                          
 */

// Answer:
public class q2_ch3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(' ');
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}