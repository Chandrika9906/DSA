import java.util.Scanner;
public class printNto1Recursion {
    public void printNumbers(int current,int N){
        if(current==0){
            return;
        }
        System.out.println(current);
        printNumbers(current-1,N);
        
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        printNto1Recursion sol = new printNto1Recursion();
        sol.printNumbers(N,0);
    }
}
/*
5
5
4
3
2
1 */