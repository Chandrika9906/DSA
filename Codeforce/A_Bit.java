import java.util.*;

public class A_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            String z = sc.next();
            if (z.equals("X++") || z.equals("++X")) {
                sum++;
            } else if (z.equals("X--") || z.equals("--X")) {
                sum--;
            }
        }
        System.out.println(sum);
    }
}
