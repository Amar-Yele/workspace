import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

//		WAP to implement Anagram Checking least inbuilt methods being used.
		String str1 = "life";
		String str2 = "file";
		
		// Convert given strings in Array
		char str11[] = str1.toCharArray();
		char str22[] = str2.toCharArray();
		
		Arrays.sort(str11);
		Arrays.sort(str22);
		System.out.println(str11);
		System.out.println(str22);
		
//		so here we have to create one boolean value for checking the value true or false
		boolean result = Arrays.equals(str11, str22);
		
		if(result == true) {
			System.out.println("Given String is Anagram");
		}else {
			System.out.println("Giver String is not Anagram");
		}

	}

}
