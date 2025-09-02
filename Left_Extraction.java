import java.util.Scanner;

public class Left_Extraction {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int num=sc.nextInt(),pv=1;
        while(num/pv!=0){
            pv=pv*10;
        }
        pv=pv/10;//no of digits
        while(pv!=0){
            int dig=(num/pv)%10;
            System.out.println(dig);
            pv=pv/10;
        }
    }
}
/*
 * 56789
5
6
7
8
9
 */