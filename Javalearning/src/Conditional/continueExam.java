package Conditional;

import java.util.Scanner;

public class continueExam {

	private static Scanner n;

	public static void main(String[] args) {
		
		n = new Scanner(System.in);
		
		System.out.println("Enter a value:    " + n);
		
		int a = n.nextInt();
		
		for (int i = 1 ; i <= a ; i++) {
			if (i==5) {
				System.out.println("");
				continue;
			}
			System.out.println(i);
		}

	}
	}


