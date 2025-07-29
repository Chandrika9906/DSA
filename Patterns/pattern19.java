import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of rows for each half

        // Top half
        for (int i = 0; i < n; i++) {
            // Left stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // Middle spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = 0; i < n; i++) {
            // Left stars
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*");
            }
            // Middle spaces
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
 8
****************
*******  *******
******    ******
*****      *****
****        ****
***          ***
**            **
*              *
*              *
**            **
***          ***
****        ****
*****      *****
******    ******
*******  *******
****************
 */
