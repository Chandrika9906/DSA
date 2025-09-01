import java.util.Scanner;

public class A_Mix_Mex_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean isGood = true;

            // Check all subarrays of length 4
            for (int i = 0; i <= n - 4; i++) {
                int[] count = new int[101];  // For numbers 0 to 100
                int unique = 0;

                for (int j = i; j < i + 4; j++) {
                    if (arr[j] != -1) {
                        if (count[arr[j]] == 0) {
                            count[arr[j]] = 1;
                            unique++;
                        }
                    }
                }

                if (unique > 3) {
                    isGood = false;
                    break;
                }
            }

            System.out.println(isGood ? "YES" : "NO");
        }
    }
}
