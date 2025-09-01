import java.util.Scanner;

public class array_palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int front=0,rear=size-1,flag=0;
        for(;front<size;front++,rear--){
            if(arr[front]!=arr[rear]){
                System.out.println("Not");
                flag=1;
                break;
            }
        }
        if(front>=rear){
            System.out.println("YES");
        }
    }
}
/*
 * 5
1 2 3 4 5
Not
5
1 2 3 2 1
YES
 */