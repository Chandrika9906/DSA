
import java.util.Scanner;

public class Reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dig,num=sc.nextInt(),res=0;;
        while(num!=0){
            dig=(num%10);
            res=res*10+dig;
            num=num/10;
        }
        System.out.println(res);
    }
}
/*
 * 56789
98765
 */