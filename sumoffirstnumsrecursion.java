
import java.util.Scanner;

public class sumoffirstnumsrecursion {
    public int sum(int N){
        if(N==0){
            return 0;
        }
        else{
            return N+sum(N-1);
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        sumoffirstnumsrecursion obj = new sumoffirstnumsrecursion();
        System.out.println(obj.sum(N));

    }
}
/*
5
15 */
