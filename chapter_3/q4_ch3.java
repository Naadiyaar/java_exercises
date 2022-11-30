/*
 * Question: rewrite bellow command using for loop
 * 
 * int i = 1;
 * while (i <= 101){
 *      if (i < 5 && i != 2){
 *      System.out.println('x');
 *      }
 *      i++;
 * }
 */












// Answer:
public class q4_ch3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 101; i++) {
            if (i < 5 && i != 2)
                System.out.println('x');
        }
    }
}