
import java.util.Scanner;

public class factorialrecursion {
    public int fact(int N){
        if(N==0){
            return 1;
        }
        else{
            return N*fact(N-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        factorialrecursion sol = new factorialrecursion();
        System.out.println(sol.fact(N));
    }
}
/*
5
120 */


