package learning.java;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class Maptesting {
@Test

public void Employee() {
	HashMap<Integer,String>Emp =new HashMap<Integer,String>();
	
	Emp.put(45, "Karthick");
	Emp.put(43, "Maaran");
	Emp.put(40, "Manoj");
	Emp.put(42, "Santhosh");
	Emp.put(44, "Subash");
	Emp.put(41, "Tamil");
	Emp.put(46, "Manikandan");
	
	for(Map.Entry<Integer, String>Employee:Emp.entrySet()) {
		System.out.println("Employee Code : " + Employee.getKey());
		System.out.println("Employee Name : " + Employee.getValue());
	}
	
	System.out.println(Emp.containsValue("Santhosh"));
	
}

}
