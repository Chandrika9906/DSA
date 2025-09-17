import java.util.Scanner;

public class sum_of_factors {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum=0,num=sc.nextInt();
    for(int i=1;i<=num;i++){
      if(num%i==0){
      sum=sum+i;
    }
  }
  System.out.print(sum);
}
}
/*
 * 16
 * 31
 */