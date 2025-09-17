import java.util.Scanner;

public class print_factorspair {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        for (long checkFactor = 1; checkFactor * checkFactor <= input; checkFactor++) {
            if (input % checkFactor == 0) {
                System.out.printf("%d * %d\n", checkFactor, input / checkFactor);
            }
        }
    } 
}
/*
 * 56
1 * 56
2 * 28
4 * 14
7 * 8
 */