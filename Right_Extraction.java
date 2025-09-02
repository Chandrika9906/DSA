
import java.util.Scanner;

public class Right_Extraction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt(),pv=1;
        while(num>pv){
            int dig=(num/pv)%10;
            System.out.println(dig);
            pv=pv*10;
        }

    }
}
 /*  
 56789
9
8
7
6
5
 */