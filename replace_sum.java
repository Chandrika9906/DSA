//replace each element with sum of all elements except itself

import java.util.Scanner;

public class replace_sum {
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int sum=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
       }
       for(int j=0;j<size;j++){
            arr[j]=sum-arr[j];
            System.out.print(arr[j]+" ");
       }
    }  
}
/*
 * 5
12 10 5 20 15
50 52 57 42 47 
 */
