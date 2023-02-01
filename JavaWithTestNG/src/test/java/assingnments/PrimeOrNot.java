package assingnments;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = n.nextInt();
		
		if(num/1==1 || num/num==1) {
			System.out.println(num + "is not Prime");
		 if(num/2==1) 
				System.out.println(num + "is prime");
			}else {
				System.out.println(num + "is not prime");
			}
			
		}
	
}
	

