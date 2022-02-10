/**
 * 
 */
package com.example.firstmicroservice.test.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author amrja
 *
 */
public class HashMapIteration {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

// Adding mappings to HashMap
		hm.put("GeeksforGeeks", 54);
		hm.put("A computer portal", 80);
		hm.put("For geeks", 82);

// Printing the HashMap
		System.out.println("Created hashmap is" + hm);

// Loop through the hashmap
// and add bonus marks
		System.out.println("HashMap after adding bonus marks:");

// Using Hashmap.forEach()
		hm.forEach((k, v) -> System.out.println(k + " : " + (v + 10)));

		hm.entrySet().stream().filter(k -> k.getKey().equals("GeeksforGeeks"))
				.forEach(k -> System.out.println(k.getKey() + " : " + k.getValue()));
		
		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("abc");
		list.add("abc");
	}

}
