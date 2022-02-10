package com.example.firstmicroservice.test.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public void test() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		List<Integer> collect = list.stream().filter(l -> l % 2 == 0).map(l -> l * l).collect(Collectors.toList());
		System.out.println(collect);

		String[] str1 = { "a", "b" };
		String[] str2 = { "c", "d" };

		List<String> list1 = Arrays.asList(str1);
		List<String> list2 = Arrays.asList(str2);

		List<List<String>> list3 = Arrays.asList(list1, list2);

		list3.stream().flatMap(l -> l.stream().map(e -> e.toUpperCase())).forEach(System.out::print);
	}

	public void reverse() {
		int i = 239, rev = 0;
		System.out.println("Original: " + i);
		while (i != 0) {
			int digit = i % 10;
			rev = rev * 10 + digit;
			i /= 10;
		}
		System.out.println("Reversed: " + rev);
	}

	public static void main(String[] args) {
		new Demo().reverse();
	}
}
