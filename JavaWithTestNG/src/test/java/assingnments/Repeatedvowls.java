package assingnments;

public class Repeatedvowls {
	

	public static void main(String[] args) {
		int count = 0; int maxcount = 0;
		String Vowels = "ygenefjewiodj";
		
		char[] rep = Vowels.toCharArray();
	   
		System.out.println("The Repeated  in Vowels are");
		
		for(int i=1;i<=rep.length-1;i++) {
			count++;
		for(int j=i+1;j<count;j++) {
			if(count>maxcount) {
				maxcount=count;
					
					System.out.println(rep[j]);
				}
			}
		}
		
	}
	}

