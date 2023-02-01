package methodlearning;

public class methodsample {
	//method without arg without return
public void mul() {
	int a = 3;
	int b = 5;
	
	System.out.println(a*b);
}
    //method with arg without return
public void mularg(int a , int b) {
	System.out.println(a*b);
}
   //method without arg with return
public int mulWret() {
	int a = 4;
	int b = 5;
	return a*b;
	
}
  //method with arg with return
public int mulwargwret(int a , int b) {
	return a*b;
}
}
