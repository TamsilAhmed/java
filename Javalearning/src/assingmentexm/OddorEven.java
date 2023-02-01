package assingmentexm;

import java.util.Scanner;

public class OddorEven {

	private static Scanner s;
	

	public static void main(String[] args) {
		
		int a;
		s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
	     a = s.nextInt();
		
		
		if (a%2==0) {
			System.out.println("the number is even");
			
		}else{
			System.out.println("the number is odd");
		}
	}

}
