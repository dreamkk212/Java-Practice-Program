public class ReverseWordInString {


	public static void main(String[] args) {
	
	String reverseString="the sky is blue";
	System.out.println(reverseWordInString(reverseString));
	}
	
	
	
	public static String reverseWordInString(String str) {
	String[] strArry = str.split(" ");
	StringBuilder strBuilder = new StringBuilder();
	for(int i=strArry.length-1 ; i >=0 ; i--) {
		strBuilder.append(strArry[i]).append(" ");
	}
		return strBuilder.toString();
	}
}