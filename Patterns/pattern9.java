/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class pattern9
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    
		    for(int j=0;j<n-i-1;j++){
		       System.out.print(" ");
		    }
		    for(int j=0;j<2*i+1;j++){
		        System.out.print("*");
		    }
		    for(int j=0;j<n-i-1;j++){
		        System.out.print(" ");
		    }
		    System.out.println();
		}
		for(int i=0;i<n;i++){
		    
		    for(int j=0;j<i;j++){
		       System.out.print(" ");
		    }
		    for(int j=0;j<2*n - (2*i + 1);j++){
		        System.out.print("*");
		    }
		    for(int j=0;j<i;j++){
		        System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}
/* 
 5
    *    
   ***   
  *****  
 ******* 
*********
*********
 ******* 
  *****  
   ***   
    *  
*/
