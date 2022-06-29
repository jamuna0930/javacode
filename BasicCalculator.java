package operator;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		//Declare variables
		
		double num1 =0.0 , num2=0.0;
		char operator ='\0';
		
		//create scanner class object to read input
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter two Number");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		
		//read operator
		
		System.out.println("Available operators" + "are :: (+ - * % ^)");
		System.out.println("Enter operator:");
		operator = scan.next().charAt(0);
		
		//switch case statements
		switch(operator) {
		      
		   case '+' :
			   System.out.println("result =" +(num1 +num2));
			   break;
		   case '-' :
			   System.out.println("result =" +(num1 - num2));
			   break;
			   
		   case '*' :
			   System.out.println("result =" +(num1 *num2));
			   break;
			   
		   case '%' :
			   System.out.println("result =" +(num1 %num2));
			   break;
			   
		   case '^' :
			   System.out.println("result =" + Math.pow(num1,num2));
			   break;
			   
			   default:
				   System.out.println("invalid operator");
		
		}  // end of switch-case
		
		//close scanner class object
		scan.close();
	}

}
