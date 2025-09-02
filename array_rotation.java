//right rotation
import java.util.Scanner;

public class array_rotation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int nor=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        nor=nor%size;
        for(int itr=1;itr<=nor;itr++){
             int safe = arr[size-1];
            for(int ind=size-2;ind>=0;ind--){
                arr[ind+1]=arr[ind];
                
            }
            arr[0]=safe;
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
/*
 * 5
3
50 40 30 20 10
30 20 10 50 40 
 */