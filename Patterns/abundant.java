import java.util.Scanner;

public class abundant {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum=0;
    int num=sc.nextInt();
    for(int i=1;i<num;i++){
      if(num%i==0){
        sum=sum+i;
    }
  }
  if(sum>num){
    System.out.println("Abundant Number");
  }
  else if(sum<num){
    System.out.println("Deficient Number");
  }
  else{
    System.out.println("Perfect Number");
  }
  
}
}
/*
 * 16
Deficient Number
 */
