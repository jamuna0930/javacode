package Array;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int e=0,o=0;
		System.out.println("Enter your limit :");
	     try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int a[]=new int[n];
			for(int i=0;i<=n;i++)
			{
				System.out.println("Enter a [" +i+ "]value :");
				a[i]= scanner .nextInt();
			}
			  for(int element : a)
			  {
				  if(element%2==0)
				  {
					  e++;
					  
				  } 
				  else
				  {
					  o++;
				  }
			  }
		}
		System.out.println("Total Even numbers :" + e);
			  System.out.println("Total odd number :" + o);
		  }
	}


