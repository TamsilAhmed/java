package learning.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class Collectionlearning {
	@Test

	public void Arraylistlearning() {
		
		ArrayList<Integer>mark = new ArrayList<Integer>();
		
		mark.add(100);
		mark.add(50);
		mark.add(41);
		mark.add(85);
		System.out.println(mark);
		System.out.println(mark.remove(3));
		
	}
@Test

public void Studentname() {
	
	ArrayList<String>students = new ArrayList<String>();
	
	students.add("tamsil");
	students.add("ahmed");
	students.add("moorthy");
	students.add("sathish");
	
	System.out.println(students);
	
	System.out.println(students.get(2));
	
	System.out.println(students.size());
	
	Iterator i = students.iterator();
	
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
@Test
public void Listexa() {
	List<String>Alpha = new ArrayList<String>();
	
	Alpha.add("B");
	Alpha.add("A");
	Alpha.add("T");
	Alpha.add("C");
	Alpha.add("A");
	Alpha.add("V");
	Alpha.add("B");
	
		Iterator i = Alpha.iterator();
			
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

@Test

public void Hashsetlear() {
	Set<String>Alpha = new HashSet<String>();
	

	Alpha.add("B");
	Alpha.add("A");
	Alpha.add("D");
	Alpha.add("C");
	Alpha.add("A");
	Alpha.add("E");
	Alpha.add("B");
	
	Iterator i = Alpha.iterator();
	
	while(i.hasNext()) {
		System.out.println(i.next());
	}
		
}
}



