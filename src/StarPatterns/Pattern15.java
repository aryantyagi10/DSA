/*

A B C D
A B C
A B
A
 */


package StarPatterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(char ch='A'; ch<='A' + (n-i-1); ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
