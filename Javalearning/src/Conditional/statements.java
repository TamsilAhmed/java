package Conditional;

public class statements {

	static int age = 19;

public static void main(String[] args) {

		if (age > 18) {
			System.out.println("the person is allowed to vote");
			
		} else if (age == 18) {
			System.out.println("the person is wait to vote");

		} else {
			System.out.println("the person is not eligible to vote");
		}

	}
}
