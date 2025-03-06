package com.practice;

import java.util.Arrays;

public class AnagramPrograms {

	public static boolean isAnagrams(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
	}

	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "silent";
		System.out.println(isAnagrams(str1, str2));
		String str3 = "hello";
		String str4 = "world";
		System.out.println(isAnagrams(str3, str4));

	}
}
