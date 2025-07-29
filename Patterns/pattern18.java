import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // number of rows (must be <= 5)
        char endch=(char)('A'+n-1);
        for (int i = 0; i < n; i++) {
            char ch = (char) (endch - i);  // starting character of the row

            for (char c = ch; c <= endch; c++) {
                System.out.print(c + " ");
            }

            System.out.println();
        }
    }
}
/*
 5
E 
D E 
C D E 
B C D E 
A B C D E 
 */
