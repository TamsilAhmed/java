package samples;

public class Methodcall {

	public static void main(String[] args) {
		Methodoverloading obj = new Methodoverloading() ;
			
		obj.add(4, 5);
		obj.add(5, 5);
		obj.add(5, 8.5, 5);
		obj.add(5, 9, 10);
		obj.add(5, 8, 10, 6);
		obj.add(4, 7, 6);

	}

}
