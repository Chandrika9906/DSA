import java.util.Scanner;

public class Add_digits2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
            int sum=(num%9==0)?9:(num%9);
            System.out.println(sum);
    }
}
/*
 * 87352
 * 7
 * another method using formula ((num-1)%9)+1;
 */
