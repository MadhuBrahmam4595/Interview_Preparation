package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Reverseastring {
	
	public static String reverseString(String str) {
		char ch;
		String revStr="";
		
		for(int i=0; i < str.length(); i++) {
			ch = str.charAt(i);
			revStr = ch + revStr;
		}
		
		return revStr;
	}
	public static String reverseString2(String str) {
		
		byte[] strBytes = str.getBytes();
		byte[] byteArray = new byte[strBytes.length];
		
		for(int i=0; i< strBytes.length; i++) 
			byteArray[i] = strBytes[strBytes.length-i-1];
		
		return new String(byteArray);
	}
	
	public static String reverseString3(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		return sb.toString();
	}
	
	public static String reverseString4(String str) {
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
		return sb.toString();
	}
	public static String reverseString5(String str) {
		
		char[] charArray = str.toCharArray();
		List<Character> listChar = new ArrayList<Character>();
		
		for(int i=0; i < charArray.length; i++)
			listChar.add(charArray[i]);
		
		Collections.reverse(listChar);
		
		String revStr = "";
		
		for(char c:listChar) revStr = revStr + c;
		
		return revStr;
	}
	public static String reverseString6(String str) {
		
		String revStr = "";
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char c: str.toCharArray())
			stack.push(c);
		
		while(!stack.isEmpty()) {
			revStr += stack.pop();
		}
		
		return revStr;
	}
	 
	
	
	public static void main(String[] args) {
		System.out.println(reverseString("madhu"));
		System.out.println(reverseString2("madhu"));
		System.out.println(reverseString3("madhu"));
		System.out.println(reverseString4("madhu"));
		System.out.println(reverseString5("madhu"));
		System.out.println(reverseString6("madhu"));
	}

}
