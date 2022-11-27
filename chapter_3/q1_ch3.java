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
public class q1_ch3{
    public static void main(String[] args){
        String star = "* ";

        for (int i = 1; i <= 6; i++){
            for (int j = i; j >= 1; j--) {
                System.out.print(star);
            }
            
            System.out.println();
        }
    }
}


// upside down
// public class q1_ch3{
//     public static void main(String[] args){
//         String star = "* ";

//         for (int i = 1; i <= 6; i++){
//             for (int j = i; j <= 6; j++) {
//                 System.out.print(star);
//             }
            
//             System.out.println();
//         }
//     }
// }