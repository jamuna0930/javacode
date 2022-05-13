package controlStatements;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first Number: ");
	    a = scanner.nextInt();
	    System.out.println("Enter second Number: ");
	    b = scanner.nextInt();
	    char operator;
	    System.out.println("Enter second operator +,-,*,/ or % : ");
	    operator = scanner .next().charAt(0);
	    
	    switch(operator) {
	    case '+':
	    	System.out.println(a + " + " + b + " = "+ (a+b));
	    	break;
	    case '-':
	    	System.out.println(a + " - " + b + " = "+ (a-b));
	    	break;
	    case '*':
	    	System.out.println(a + " * " + b + " = "+ (a*b));
	    	break;
	    case '/':
	    	System.out.println(a + " / " + b + " = "+ (a/b));
	    	break;    				
	    case '%':
	    	System.out.println(a + " % " + b + " = "+ (a%b));
	    	break;
	    default:
	    	System.out.println("you have entered incorrect operatot");
	    	
	    	
	    }

	}

}
