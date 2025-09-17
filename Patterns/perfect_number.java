import java.util.Scanner;

public class perfect_number {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum=0;
    int num=sc.nextInt();
    for(int i=1;i<num;i++){
      if(num%i==0){
        sum=sum+i;
    }
    
  }
  if(num==sum){
    System.out.print("Perfect Number");
  }
  else{
    System.out.print("Not a Perfect Number");
  } 
}
}
/*
 * 16
Not a Perfect Number
 */