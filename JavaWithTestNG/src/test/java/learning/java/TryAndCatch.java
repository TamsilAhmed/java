package learning.java;

import org.testng.annotations.Test;

public class TryAndCatch {
	
@Test
	
public void ArithmaticException() {
	int a = 5;
	try {
		
		System.out.println(a/0);
		try {
			System.out.println(a/2);
		
	}catch (Exception e) {
		e.printStackTrace();
	
	
	}}catch(Exception e) {
		e.printStackTrace();
	}
	
}
@Test
public void NullPointerException() {
	String a = null;
	try
	{
		System.out.println(a.length());
	}catch (NullPointerException e) {
		e.printStackTrace();
	}
}
@Test

public void NumberFromateException() {
	String a = "hello";
	try {
		System.out.println(Integer.parseInt(a));
		
	}catch(NumberFormatException e) {
		e.printStackTrace();
	}
}
@Test
public final void ArrayindexoutofboundException() {
	int[] a =new int[2];
	a[1]=2;
	a[0]=1;
	try {
		System.out.println(a[2]);
	}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}finally {
		System.out.println("Exception executed");
	}
}
@Test
public void throwlearnung() {
	throw new ArithmeticException("hello");
}
@Test
public void throwslearnung() throws ArithmeticException{
	throw new ArithmeticException("hello");
}
}
