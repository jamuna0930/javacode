package operator;
import java.util.Scanner;
public class testproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("Enter your age :");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		age = scan.nextInt();
		if(age<=18)
		{
		  System.out.println("your are eligible");
     }
		else
     {
    	 System.out.println(" your are not eligible");
     }
		
  }
}