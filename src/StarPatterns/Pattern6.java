/*

1 2 3
1 2
1

 */

package StarPatterns;

import java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print(n-j+1 + " ");
            }
            System.out.println();
        }

    }
}
