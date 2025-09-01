
import java.util.Scanner;

public class Add_digits{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            while(num!=0){
                int dig=num%10;
                sum=sum+dig;
                num=num/10;
            }
            if(sum>=10){
                num=sum;
                sum=0;
            }
        }
        System.out.println(sum);
    }

}
/*
 * 87352
 * 7
 */