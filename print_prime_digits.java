
import java.util.Scanner;

public class print_prime_digits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int pv =1;
        while(num/pv!=0){
            pv=pv*10;
        }
        pv=pv/10;
        while(pv>0){
        int dig=(num/pv)%10;
        if(dig==2|| dig==3 || dig==5 || dig==7){
            System.out.println(dig);
        }
        pv=pv/10;
    }
     sc.close();
    }
}
/*
 * 835765
3
5
7
5
 */