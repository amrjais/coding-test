package com.example.firstmicroservice.test.test;

import java.util.HashMap;
import java.util.Map.Entry;

public class testNew {
	/*
	 * Example 1: Input: ransomNote = "a", magazine = "b" Output: false
	 * 
	 * Example 2: Input: ransomNote = "aa", magazine = "ab" Output: false
	 * 
	 * Example 3: Input: ransomNote = "aa", magazine = "aab" Output: true
	 * 
	 * 
	 * Constraints: 1 <= ransomNote.length, magazine.length <= 105 ransomNote and
	 * magazine consist of lowercase English letters.
	 * 
	 * 
	 * 
	 */

	public static boolean canConstruct(String ransomNote, String magazine) throws Exception {
		if (ransomNote.length() < 0 || ransomNote.length() > 105) {
			throw new Exception();
		}
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for (int i = 0; i <= magazine.length(); i++) {
			Integer count = 0;
			if (map1.get(magazine.charAt(i)) != null) {
				count++;
			}
			map1.put(magazine.charAt(i), count);
		}

		for (int i = 0; i <= ransomNote.length(); i++) {
			Integer count = 0;
			if (map2.get(ransomNote.charAt(i)) != null) {
				count++;
			}
			map2.put(ransomNote.charAt(i), count);
		}

		for (Entry<Character, Integer> entry : map1.entrySet()) {

			if (map2.get(entry.getKey()) == entry.getValue()) {

			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		System.out.println(canConstruct("a", "b"));
		System.out.println(canConstruct("aa", "ab"));
		System.out.println(canConstruct("aa", "aab"));
	}
}
