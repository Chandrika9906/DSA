import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // input: number of rows

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print alphabet pyramid (increasing then decreasing)
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);

                if (j < breakpoint)
                    ch++;     // Increase until midpoint
                else
                    ch--;     // Decrease after midpoint
            }

            System.out.println();  // New line after each row
        }
    }
}
/*
 5
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
 */