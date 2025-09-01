import java.util.Scanner;

public class array_reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int front=0,rear=size-1,temp;
        for(;front<rear;front++,rear--){
            temp=arr[front];
            arr[front]=arr[rear];
            arr[rear]=temp;
        }
        for(int j=0;j<size;j++){
            System.out.print(arr[j]+" ");
        }
    
    }
}
/*
 * 5
10 20 30 40 50
50 40 30 20 10 
 */