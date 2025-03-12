/*

1
2 3
4 5 6
7 8 9 10

 */

package StarPatterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int count = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
