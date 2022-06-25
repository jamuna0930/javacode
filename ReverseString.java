package controlStatements;

import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          System.out.println("Enter your value :");
          @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
          int n = scan.nextInt();
          int revers =0,rem;
          while(n!=0)
          {
        	  rem =n%10;
        	  revers=(revers*10)+rem;
        	  n=n/10;
          }
          System.out.println(" Revered number :");
	}
		
}	
