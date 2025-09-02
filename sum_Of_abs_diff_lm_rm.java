
import java.util.Scanner;

public class sum_Of_abs_diff_lm_rm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt(),left_dig,right_dig,diff,sum=0,pv1=1,pv2=1;
        while(num/pv1!=0){
            pv1=pv1*10;
        }
        pv1=pv1/10;
        while(pv1>=pv2){
            left_dig=(num/pv1)%10;
            right_dig=(num/pv2)%10;
            if(pv1==pv2){
                sum=sum+left_dig;
            }
            else{
                diff=Math.abs(left_dig-right_dig);
                sum=sum+diff;
            }
            pv1=pv1/10;
            pv2=pv2*10;
        }
        System.out.println(sum);

    }
}
/*
 * 1234
4
 */
