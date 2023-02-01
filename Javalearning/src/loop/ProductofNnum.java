
package loop;

public class ProductofNnum {
	
	static int n = 1; static int product = 1;
	
	public static void main(String[] args) {
		
		System.out.println("examples");
		
		doproduct();
		System.out.println("examples");
	}
		
		
		
		public static void doproduct(){
		while (n <= 10) {
			product = n*product;
			n++;
			
		}
		
		System.out.println("Product of 10 number is " + product);

	}
	
	

}
