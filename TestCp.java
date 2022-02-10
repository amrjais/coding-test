package com.example.firstmicroservice.test.test;

public class TestCp {

	public void replace() {

		String input1 = "10010045";
		String input2 = "11010403";
		String input3 = "1110";

		String output1 = replaceWith00(input1, input1.length());
		String output2 = replaceWith00(input2, input2.length());
		String output3 = replaceWith00(input3, input3.length());

		System.out.println(output1);
		System.out.println(output2);
		System.out.println(output3);

	}

	private String replaceWith00(String inputString, int length) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while (sb.length() < length) {
			if (inputString.charAt(i) == '0' && (sb.length() + 1 != length)) {
				sb.append('0');
			}
			sb.append(inputString.charAt(i));
			i++;
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "xyz";

		str1 = str1.concat(str2);
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str1.length() - str2.length());

		System.out.println(str1);
		System.out.println(str2);

		new TestCp().replace();
	}
}
