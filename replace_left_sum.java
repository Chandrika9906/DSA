//replace each element with sum of its all left side elements except itself
import java.util.Scanner;

public class replace_left_sum {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int sum=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            System.out.print(sum+" ");
            sum=sum+arr[i];
       }
       
    }
}
/* 
 * 5
12 10 5 20 15
0 12 22 27 47 
 */
