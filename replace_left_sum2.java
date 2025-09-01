import java.util.Scanner;

public class replace_left_sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;

        // input + total sum
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // compute left sums in reverse loop
        for (int i = size - 1; i >= 0; i--) {
            sum -= arr[i];   // left sum = total - right part - current
            arr[i] = sum;
        }

        // print
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
 * 5
12 10 5 20 15
0 12 22 27 47
 */