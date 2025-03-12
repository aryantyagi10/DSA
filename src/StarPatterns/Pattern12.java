/*

1             1
1 2         2 1
1 2 3     3 2 1
1 2 3 4 4 3 2 1

 */

package StarPatterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int space = 2*(n-1);     //Number of spaces for first row as per number of rows.

        for(int i=1; i<=n; i++){
            //number
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            //space
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }

            //number
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            System.out.println();
            space = space-2; //reduces space by 2 for every row.
        }

    }
}
