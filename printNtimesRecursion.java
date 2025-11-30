import java.util.Scanner;

public class printNtimesRecursion {
    
    public void printName(String str,int count,int N) {
        if(count == N){
            return;
        }
        System.out.println(str);
        printName(str,count+1,N);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printNtimesRecursion sol = new printNtimesRecursion();
        int N=sc.nextInt();
        String str=sc.next();
        
        sol.printName(str,0,N);
  
        
}
}
/*5
chandu
chandu
chandu
chandu
chandu
chandu */