
import java.util.Scanner;

public class nth_array_rotation {
    public static void array_reverse(int[] arr ,int start_ind,int end_ind) {
        int front=start_ind,rear=end_ind,temp;
        for(;front<rear;front++,rear--){
            temp=arr[front];
            arr[front]=arr[rear];
            arr[rear]=temp;
        }

    }

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int nor=sc.nextInt();
    int size=sc.nextInt();
    int[] arr = new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    nor=nor%size;
    array_reverse(arr, 0, size-1);
    array_reverse(arr, 0, nor-1);
    array_reverse(arr, nor, size-1);
    for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
    }
}

}
/*
 * 3
5
10 20 30 40 50 
30 40 50 10 20 
 */