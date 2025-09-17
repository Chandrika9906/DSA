import java.util.Scanner;

public class Amicableornot {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int sum1=0,sum2=0;
    for(int i=1;i<num1;i++){
      if(num1%1==0){
        sum1=sum1+i;
    }
  }
  for(int i=1;i<num2;i++){
    if(num2%i==0){
      sum2=sum2+i;
    }
  }
  if(sum1==num2 && sum2==num1){
    System.out.println("Amicable pair");
  }
  else{
    System.out.println("Not a Amicable pair");
  }
}
}
/*
 * 16
24
Not a Amicable pair
 */