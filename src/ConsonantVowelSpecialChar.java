import java.util.Scanner;

public class ConsonantVowelSpecialChar {

	public static void main(String[] args) {
		
//		WAP to count the number of consonants, vowels, special characters in a String.
		
		String S;
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter Your String: ");
		S = SC.nextLine();
		
//we have successfully taken i/p from user now we have to change case of I/P either LowerCase or UpperCase
		S = S.toLowerCase();
		
//now we have to define values for each element such as vowel consonant, Special characters, numbers, and Spaces
		int V = 0, C = 0, N = 0, Sp = 0, Special = 0;
		char ch;
		
		for(int i=0; i<S.length(); i++) {
			ch = S.charAt(i);
//			for characters printing
			if(ch >= 'a' && ch <= 'z') {
				
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
//					System.out.println(V++);
					V++;
				}
				else {
					C++;
				}
			}
//			Now here we will print a Numbers
			else if(ch>='0' && ch<='9') {
				N++;
			}
//			here we will print the Spaces
			else if(ch==' ') {
				Sp++;
			}
//			others remainings all are considered as a Special Characters 
			else {
				Special++;
			}
		}
		System.out.println("Vowels are : "+V);
		System.out.println("Cosonant are : "+C);
		System.out.println("Numbers are : "+N);
		System.out.println("Spaces are : "+Sp);
		System.out.println("Special Characters are : "+Special);
		
	}

}
