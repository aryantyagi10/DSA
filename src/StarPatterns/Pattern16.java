/*

A
B B
C C C
D D D D

 */


package StarPatterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int ascii = 65;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                char alpha = (char)ascii;
                System.out.print(alpha);
            }
            System.out.println();
            ascii++;
        }


        /* 2nd Method
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)((int)('A' + i)) + " ");
            }
            System.out.println();
        }

         */
    }
}
