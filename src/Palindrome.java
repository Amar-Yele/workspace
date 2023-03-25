
public class Palindrome {

	public static void main(String[] args) {
		
//		WAP to check if “2552” is palindrome or not.
		// to check given string is palindrome or not
		
		String str = "2552";
//		1st we have to store this in empty string or array
		String str2 = "";
//		
//		for(int i = 0; i<str.length(); i++) {
//			str2 = str2+str.charAt(i);
//		}
		System.out.println(str2);
		
		for(int i=str.length()-1; i>=0; i--) {
			str2 = str2+str.charAt(i);
			
		}
		System.out.println(str2);
		if(str.equals(str2)) {
			System.out.println("Entered String is a Palindrome");
		}
		else {
			System.out.println("Given String is not a Palindrome");
		}
	}

}
