
import java.util.Scanner;

public class Even_Odd_Segregation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even=0,odd=0,opv=1,epv=1;
        int num=sc.nextInt();
        while(num!=0){
            int dig=(num)%10;
            if(dig%2==0){
                even=dig*epv+even;
                epv=epv*10;
            }
            else{

                
                odd=dig*opv+odd;
                opv=opv*10;
            }
            num=num/10;
        }
        System.out.println(even*opv+odd);
    }
}

/*
 * 23456789
 * 24683579
 */
