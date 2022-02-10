package com.example.firstmicroservice.test.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		list.stream().filter(l -> l % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

		// Select Max(Salary) from Employee where Salary < (Select Max(Salary) from
		// Employee)
	}
}
