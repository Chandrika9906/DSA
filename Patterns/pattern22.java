import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // input number

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int top = i;
                int left = j;
                int right = size - 1 - j;
                int down = size - 1 - i;

                // Take minimum of all distances from borders
                int minDist = Math.min(Math.min(top, down), Math.min(left, right));
                System.out.print(n - minDist);
            }
            System.out.println();
        }

        sc.close();
    }
}
/*
 5
555555555
544444445
543333345
543222345
543212345
543222345
543333345
544444445
555555555
 */