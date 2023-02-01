package learning.java;

import java.util.Scanner;

import org.testng.annotations.Test;

@Test
public class OddorEvenNum {
	public void OddorEven() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
	int n = sc.nextInt();
	if(n%2==1) {
		System.out.println("The number is Even");
	}else {
		System.out.println("The number is odd");
	}

	
	
	
}
	@Test
public void Stringtest() {
	Scanner S = new Scanner(System.in);
	System.out.println("Enter String : ");
	
	String n = S.next();
	
	System.out.println(n);
		
	
}
}

