package methodlearning;

public class Methodcalling {

	public static void main(String[] args) {

		methodsample obj = new methodsample();

		obj.mul();
		obj.mularg(3, 6);

		int result = obj.mulwargwret(5, 8);
		System.out.println(result);

		int result1 = obj.mulWret();
		System.out.println(result1);

	}

}
