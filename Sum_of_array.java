import java.util.Scanner;

public class Sum_of_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int sum=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
       }
       System.out.println(sum);

    }
}
/*
 * 5
10 20 30 40 50  
150
 */
