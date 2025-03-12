/*

 *
 **
 ***
 **
 *

 */

package StarPatterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");

        int n = sc.nextInt();


        //first Star
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Second Star
        for(int i=2; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
