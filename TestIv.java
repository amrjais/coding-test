package com.example.firstmicroservice.test.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestIv {

	public static void main(String[] args) {
		new TestIv().test();

	}

	public void test() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("John", "Miller", 5000, "A1"));
		list.add(new Employee("Donald", "Trump", 500, "A1"));
		list.add(new Employee("David", "Baker", 1000, "B1"));
		list.add(new Employee("Rahul", "Gupta", 6000, "C1"));
		list.add(new Employee("Abhinav", "Roy", 7000, "C2"));

		List<Employee> collect = list.stream().filter(l -> l.getSalary() > 1000).map(this::process)
				.collect(Collectors.toList());

		Map<String, List<Employee>> collect2 = list.stream().collect(Collectors.groupingBy(l -> l.getDepartment()));

		Map<String, Long> collect3 = list.stream().collect(Collectors.groupingBy(l -> l.getDepartment(), Collectors.counting()));

		System.out.println(collect);
		System.out.println(collect2);
		System.out.println(collect3);
	}

	private Employee process(Employee emp) {

		Integer salary = emp.getSalary();
		int sal = salary.intValue() + ((salary.intValue() * 10) / 100);
		emp.setSalary(sal);
		return emp;
	}
}
