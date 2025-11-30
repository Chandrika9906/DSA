
import java.util.Scanner;

public class print1toNRecursion {
    public void printNumbers(int current,int n){
        if(current>n){
            return;
        }
        System.out.println(current+" ");
        printNumbers(current+1,n);
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            print1toNRecursion sol=new print1toNRecursion();
            int n=sc.nextInt();
            sol.printNumbers(1,n);
        }
    }

