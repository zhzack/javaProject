package com.aiit.grey;

public class TestParse {
	public static void main(String[] args) {
		System.out.println(str2num("123"));
		System.out.println(str2num("java"));
	}

	public static int str2num(String str) {
		try {
			return Integer.parseInt(str);
			
		} catch (Exception e) {

			return -1;
		}

	}
}
