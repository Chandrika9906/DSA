
import java.util.Scanner;

public class Pairwiseswap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int nod=(int)Math.log10(num)+1;
        int swap,pair,cons=0,pv=1,last_dig=-1;
        if(nod%2==1)
        {
            last_dig = num%10;
            num = num/10;
        }
        while(num!=0){
        pair=num%100;
        swap=(pair%10)*10+(pair/10);
        cons=swap*pv+cons; 
        pv=pv*100;
        num=num/100;
        }
        if(nod%2==1){
            System.out.println(cons*10+last_dig);
        }
        else{
            System.out.println(cons);
        }
    }
}
/*
 * 234567
 * 325476
 */
