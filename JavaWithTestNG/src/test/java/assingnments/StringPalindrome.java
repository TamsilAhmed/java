package assingnments;


public class StringPalindrome {

	public static void main(String[] args) {
	   StringBuffer word = new StringBuffer("LOL");
	   
	   StringBuffer wordrev = word.reverse();
	   
	   if(word==wordrev) {
		   System.out.println("The String is Palindrome");
	   }else {
		   System.out.println("The String is not Palindrome");
	   }
	    
	  
}
}