package learning.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class Maplearning {

	@Test

	public void mapexap() {

		Map<String, Integer> P = new HashMap<String, Integer>();

		P.put("A", 80);
		P.put("C", 87);
		P.put("B", 56);
		P.put("F", 84);
		P.put("E", 86);
		P.put("F", 50);
		P.put("D", 60);

			System.out.println(P);

		}

	@Test

	public void Linkedhashmaplearning() {
		Map<String, Integer> P = new LinkedHashMap<String, Integer>();

		P.put("A", 80);
		P.put("C", 87);
		P.put("B", 56);
		P.put("F", 84);
		P.put("E", 86);
		P.put("F", 50);
		P.put("D", 60);

		System.out.println(P);

	}

	@Test
	public void treemaplearnuing() {
		Map<String, Integer> P = new TreeMap<String, Integer>();

		P.put("A", 80);
		P.put("C", 87);
		P.put("B", 56);
		P.put("F", 84);
		P.put("E", 86);
		P.put("F", 50);
		P.put("D", 60);

		System.out.println(P);

	}

}
