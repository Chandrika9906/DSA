import java.util.*;
public class print_factors{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    int last=1;
  for(int j=1;j<=num;j++){
    if(num%j==0){
      if(num!=j){
      System.out.print(j+",");
      }
      else{
      System.out.print(j);
    }
  }
}
}
}
/*
 *
67
1,67
 */