//Digit Manipulation && Number Crunching
/*
 * 1) Construction
 * i)Right Append
 * ii)Left Append
 * 2)Extraction
 * i)Right Extraction
 * ii)Left Extraction
 */

import java.util.Scanner;

public class Right_append {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int dig,res=0;
        while (true) { 
            dig=sc.nextInt();
            if(dig==-1){
                break;
            }
            res=res*10+dig;
            System.out.printf("%d %d",res,dig);
        }}
    }

/*
 * 5
5 5
4
54 4
6
546 6
7
5467 7
8
54678 8
 */