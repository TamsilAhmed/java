
public class findrepeat {

	public static void main(String[] args) {

		String name = "Tamsil ahmed m m";

		char[] letter = name.toCharArray();

		System.out.println("The repeated letter are ");

		for (int i = 1; i < letter.length; i++) {
			for (int j = 1; j < i; j++)
				if (letter[i] == letter[j]) {
					System.out.println(letter[j] + " ");

				}

		}

	}
}
