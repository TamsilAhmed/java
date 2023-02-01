package strbuffANDstrbuild;

public class exam {

	public static void main(String[] args) {
         
		String str = "Tamsil";
		String str1=str;
		
		StringBuffer strbuff = new StringBuffer("Tamsil ahmed");
		StringBuffer strbuff1 = strbuff;
		
		StringBuilder strbuild = new StringBuilder("Mathina nagar");
		StringBuilder strbuild1 = strbuild;
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(strbuff);
		System.out.println(strbuff1);
		System.out.println(strbuild);
		System.out.println(strbuild1);
		
		str +=" ahmed";
		strbuff.insert(0 , "M M ");
		strbuild.insert(0 , "Street:  ");
		String a = strbuild.toString();
		
		System.out.println(str);
		System.out.println(strbuff);
		System.out.println(strbuild);
		
		
		
		

	}

}
