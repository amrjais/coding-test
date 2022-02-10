package com.example.firstmicroservice.test.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestSyne {

	public static void main(String[] args) {
		Map<Integer, Employee> map = new HashMap<>();
		map.put(1, new Employee("John", "Miller", 5000, "A1"));
		map.put(2, new Employee("jan", "abc", 2000, "A2"));
		map.put(3, new Employee("feb", "xyz", 500, "A1"));
		map.put(4, new Employee("mar", "uvw", 100, "A1"));
		
		Map<Integer, Employee> res = map.entrySet().stream().filter(k -> k.getValue().getSalary() > 1000)
				.collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue()));
		
		System.out.println(res);
	
	}
}
