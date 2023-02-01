package interfacelearning;

public class BasicCal implements Calculator {

	public void add(int a, int b) {
		a = 10;
		b = 20;
		System.out.println(a+b);


		
	}

	public void mul(int a, int b) {
		a=4;
		b=5;
		System.out.println(a*b);


		
	}

	public void sub(int a, int b) {
		a=20;
		b=5;
		System.out.println(a/b);
		
	}

	
}
