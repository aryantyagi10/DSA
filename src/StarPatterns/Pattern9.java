/*

   *
  ***
 *****
 *****
  ***
   *

 */

package StarPatterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        //First Star
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            //star
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }

            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            System.out.println();
        }

        //Second Star
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=0; j<2*n-(2*i+1); j++){
                System.out.print("*");
            }

            //space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
