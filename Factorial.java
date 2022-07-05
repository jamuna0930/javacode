package controlStatements;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Enter your limit :");
         try (Scanner scan = new Scanner(System.in)) {
			int n = scan .nextInt();
			 int f = 1;
			 for(int i=1;i<=n;i++)
			 {
				 f= f*i;
			 }
			  System .out.println("your fatorial value " + n + " is " + f);
		}
	}
	

}
