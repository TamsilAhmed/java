package learning.java;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Testlear {
	@Test
public void Sum() {
	Scanner S = new Scanner(System.in);
	System.out.println("Enter a value");
	int n = S.nextInt();
	System.out.println();
	int sum = 0; int i = 1;
	while(i<=n) {
		sum = sum +i;
		i++ ;

		
	}		System.out.println(sum);
	
	
}

}
