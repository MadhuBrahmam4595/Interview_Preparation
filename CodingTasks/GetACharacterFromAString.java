package demo;

public class GetACharacterFromAString {
	
	public static char getCharFromStr(String str, int index) {
		return str.charAt(index);
	}
	
	public static char getCharFromStr2(String str, int index) {
		return str.toCharArray()[index];
	}
	
	public static char getCharFromStr3(String str, int index) {
		return str.chars().mapToObj(cha-> (char)cha).toArray(Character[]::new)[index];
	}
	public static char getCharFromStr4(String str, int index) {
		return new StringBuffer(str).charAt(index);
	}
	public static char getCharFromStr5(String str, int index) {
		return new StringBuilder(str).charAt(index);
	}
	
	public static void main(String[] args) {
		
		System.out.println("1=>"+getCharFromStr("madhu", 0));
		System.out.println("2=>"+getCharFromStr2("madhu", 1));
		System.out.println("3=>"+getCharFromStr3("madhu", 2));
		System.out.println("4=>"+getCharFromStr4("madhu", 3));
		System.out.println("5=>"+getCharFromStr5("madhu", 4));
		
	}

}
