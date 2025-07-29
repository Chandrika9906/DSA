
import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // For example: 4
        int spaces = 2 * n - 2;  // Initial number of spaces between stars

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;

            if (i > n) {
                stars = 2 * n - i;  // For lower half, star count decreases
            }

            // Print left stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Print middle spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print right stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();  // Move to next line

            // Update space count
            if (i < n) {
                spaces -= 2;
            } else {
                spaces += 2;
            }
        }

        sc.close();  // ✅ Prevents resource leak
    }
}
