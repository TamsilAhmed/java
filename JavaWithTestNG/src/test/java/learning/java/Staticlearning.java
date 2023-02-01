package learning.java;

public class Staticlearning {
	


String empname;
String empcode;
String add;
public Staticlearning(){
	
	}
public Staticlearning(String empname , String empcode , String add ) {
	this.empname = empname;
	this.empcode = empcode;
	this.add = add;
}
public void Display() {
	System.out.println(empname);
	System.out.println(empcode);
	System.out.println(add);
}
}


