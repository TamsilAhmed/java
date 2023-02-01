package Conditional;

import java.util.Scanner;

public class breakExa {

	public static Scanner n;

	public static void main(String[] args) {
		
		n = new Scanner(System.in);
		
		System.out.println("Enter a value:   ");
		int a = n.nextInt();
		System.out.println(n);
		
		for (int i = 1 ; i <= a ; i++) {
			if (i==5) {
				System.out.println("");
				break;
			}
			System.out.println(i);
		}

	}

}
