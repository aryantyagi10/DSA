/*

      A
    A B A
  A B C B A
A B C D C B A

 */

package StarPatterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();


        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<(n-i-1); j++){
                System.out.print(" ");
            }

            //Alphabet
           char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j=0; j<2*i+1; j++){
                System.out.print(ch);
                if(j<breakpoint) ch++;
                else ch--;
            }

            //space
            for(int j=0; j<(n-i-1); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
