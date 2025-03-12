/*

A
A B
A B C
A B C D

 */

package StarPatterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int asciiValue = 65;   //ASCII value for A.

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                char aplha = (char)asciiValue;
                System.out.print(aplha);
                asciiValue++;
            }
            System.out.println();
            asciiValue = 65;  //Back to A after every line
        }
    }
}
