import java.util.Scanner;
public class ArrayRightRotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        int ind, sum = 0;
        for (ind = 0; ind < arr.length; ind++) {
            arr[ind] = input.nextInt();
        }
        int nor = input.nextInt();///size=1000 nor=900*999
        int safe;
        nor=nor%size;
        for (int itr = 1; itr <= nor; itr++)
        {
            safe = arr[size - 1];
            for (ind = size - 2; ind >= 0; ind--)
                arr[ind + 1] = arr[ind];
            arr[0] = safe;
        }
        for(ind=0; ind<size; System.out.print(arr[ind++]+" "));
        System.out.println();
    }
}