package methodlearning;

public class CallingMethod {
	
public static void main(String[] args) {
	
	Operationwithmethod obj = new Operationwithmethod();
		
	//addition with arg
	
		obj.addwarg(14,10);	
		
	//addition with ret
		
		int addition = obj.addwret(71, 15);
		System.out.println("addition " + addition);
		
	//addition 3 num with arg
		
		
		obj.add3warg(8, 7, 6);
		
	//addition 3 num with ret
		
		int addition3 = obj.add3withret(8, 9, 10);
		System.out.println("addition of 3 num " + addition3);
		
	//division with arg
		
		obj.divwarg(85, 15);
		
	//division with ret
		
		int division = obj.divwret(15, 5);
		System.out.println("division " + division);
		
	//divition 3 num with arg
		
		obj.div3warg(90, 40, 15);
		
	//division 3 num with ret
		
		int division3 = obj.div3wret(80, 40, 20);
		System.out.println("Division of 3 num " + division3);
		
	//subraction with arg
		
		obj.subwarg(45, 24);
		
	//subration with ret
		
		int subraction = obj.subwret(45, 15);
		System.out.println("subraction " + subraction);
		
	//subraction 3 num with arg
		
		obj.sub3wreg(45, 5, 20);
		
	//subraction 3 num with ret
		
		int subraction3 = obj.sub3wret(48, 23, 14);
		System.out.println("subraction of 3 num " + subraction3);
		
		
	    
}
}