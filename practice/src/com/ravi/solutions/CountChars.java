package com.ravi.solutions;

public class CountChars {

	public static void main(String[] args) {

		String inputStr = "aabbbcccddddeeabbbgggb";
	
		System.out.println("Input String : " + inputStr);
		System.out.println("Output String with approach 1 : " + approach1(inputStr));

	}
	
	public static String approach1(String inputStr) {
		int i = 0;
		int counter = 1;
		String resStr = "";

		char ch = 0;

		while (i < inputStr.length() - 1) {

			if (inputStr.charAt(i) == inputStr.charAt(i + 1)) {
				counter++;

			} else {

				resStr += inputStr.charAt(i) + "" + counter;
				counter = 1;
			}
			i++;
		}
		ch = inputStr.charAt(i);
		if (counter > 1 && ch == inputStr.charAt(inputStr.length() - 1)) {
			resStr += ch + "" + counter;
		} else {
			resStr += ch + "" + counter;
		}

		
		return resStr;
		
	}
	
}
