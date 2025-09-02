
import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt(),sum=0;
        while(num!=0){
            int dig=num%10;
            num=num/10;
            sum=sum+dig;
        }
        System.out.println(sum);
    }
}
/*
 * 546
 * 15
 */