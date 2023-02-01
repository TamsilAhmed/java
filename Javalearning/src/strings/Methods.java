package strings;

public class Methods {

	public static void main(String[] args) {
		String a = "Selenium learning";
		String b = " Java Automation ";
		
		
		System.out.println(a.charAt(5));//return the char at specified
		
		System.out.println(a.compareTo(b));
		
		System.out.println(a.compareToIgnoreCase(b));
		
		System.out.println(a.concat(" " + b));//concat two string
		
		System.out.println(a.equals(b));//true if the two strings are equal oterwise false
		
		System.out.println(a.indent(5));//The index position from where the index of char is returned
		
		System.out.println(a.toUpperCase());//String into Uppercase letter
		
		System.out.println(a.length());//return the length of the string
		
		System.out.println(a.toLowerCase());//String into Lowercase letter
		
		System.out.println(b.trim());//Trim white spaces before and after the String
		
		System.out.println(b.contains("Java"));//true if the sequence of char value exists, otherwise false
		
		System.out.println(b.codePointAt(5)); //returns the value of character at the index
		
		System.out.println(b.endsWith(" "));//Check the String End with the passed arg
		
		System.out.println(a.startsWith("Se"));//check the string start with the passed arg
		
		
		

	}

}
