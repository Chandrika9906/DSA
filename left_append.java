
import java.util.Scanner;

public class left_append {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dig,res=0,pv=1;
        while (true) { 
            dig=sc.nextInt();
            if(dig==-1){
                break;
            }
            res=dig*pv+res;
            pv=pv*10;
            System.out.printf("%d %d",res,dig);
        }
    }
}
/*
 * 3
3 3 
4
43 4
5
543 5 
7
7543 79
97543 9
6
697543 6
0
697543 0
8
80697543 8
-1
 */