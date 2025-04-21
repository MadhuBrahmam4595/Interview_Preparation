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


========================================================
Ways to Reverse a String in Java
=================================

1. Using StringBuilder
-----------------------
String input = "hello";
String reversed = new StringBuilder(input).reverse().toString();
System.out.println(reversed); // "olleh"

2. Using a character array
---------------------------
String input = "hello";
char[] chars = input.toCharArray();
for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
    char temp = chars[i];
    chars[i] = chars[j];
    chars[j] = temp;
}
String reversed = new String(chars);
System.out.println(reversed); // "olleh"

3. Using recursion
-------------------
public static String reverseRecursive(String str) {
    if (str.isEmpty()) return str;
    return reverseRecursive(str.substring(1)) + str.charAt(0);
}
System.out.println(reverseRecursive("hello")); // "olleh"

4. Using a loop (concatenation)
--------------------------------
String input = "hello";
String reversed = "";
for (int i = input.length() - 1; i >= 0; i--) {
    reversed += input.charAt(i);
}
System.out.println(reversed); // "olleh"

5. Using Stack
---------------
import java.util.Stack;

String input = "hello";
Stack<Character> stack = new Stack<>();
for (char c : input.toCharArray()) {
    stack.push(c);
}
StringBuilder reversed = new StringBuilder();
while (!stack.isEmpty()) {
    reversed.append(stack.pop());
}
System.out.println(reversed.toString()); // "olleh"

6. Using Java 8 Streams
------------------------
import java.util.stream.Collectors;

String input = "hello";
String reversed = new StringBuilder(
    input.chars()
         .mapToObj(c -> (char)c)
         .collect(Collectors.toList()))
    .reverse()
    .toString();
System.out.println(reversed); // "olleh"

7. Using Collections and ArrayList
-----------------------------------
import java.util.*;

String input = "hello";
List<Character> list = new ArrayList<>();
for (char c : input.toCharArray()) {
    list.add(c);
}
Collections.reverse(list);
StringBuilder reversed = new StringBuilder();
for (char c : list) {
    reversed.append(c);
}
System.out.println(reversed.toString()); // "olleh"

8. Using Apache Commons Lang
-----------------------------
import org.apache.commons.lang3.StringUtils;

String input = "hello";
String reversed = StringUtils.reverse(input);
System.out.println(reversed); // "olleh"


