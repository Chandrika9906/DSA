
import java.util.Scanner;

public class largrst_ele_arr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int j=1;j<arr.length;j++){
            if(max<arr[j]){
                max=arr[j];
            }
        }        
        System.out.println("maximum is "+max);
    }
}
/*
 * 5
3
7
5
9
2
maximum is 9
 */