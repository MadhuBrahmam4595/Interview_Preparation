package demo;

public class ReplaceCharacterinaStringatSpecificIndex {
	
	public static String replaceCharacterinaStringatSpecificIndex(String str, int index,char ch) {
		str = str.substring(0, index)+ ch +str.substring(index+1);
		return str;
	}
	
	public static StringBuffer replaceCharacterinaStringatSpecificIndex2(String str, int index,char ch) {
		StringBuffer sb = new StringBuffer(str);
		sb.setCharAt(index, ch);
		return sb;
	}
	
	public static StringBuilder replaceCharacterinaStringatSpecificIndex3(String str, int index,char ch) {
		StringBuilder sb = new StringBuilder(str);
		sb.setCharAt(index, ch);
		return sb;
	}
	
	public static void main(String[] args) {
		System.out.println(replaceCharacterinaStringatSpecificIndex("maxhu",2,'d')); //madhu
		System.out.println(replaceCharacterinaStringatSpecificIndex2("maxhu",2,'d')); //madhu
		System.out.println(replaceCharacterinaStringatSpecificIndex3("maxhu",2,'d')); //madhu
	}

}
