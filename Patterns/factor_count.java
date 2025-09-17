import java.util.Scanner;

public class factor_count {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    int count=0;
    for(int i=1;i<=num;i++){
      if(num%i==0){
          count++;
        }
    }
        System.out.println(count);
  
  } 
}
/*
 * 16
 * 5
 */
