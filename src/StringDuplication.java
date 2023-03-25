import java.util.Scanner;

public class StringDuplication {

	public static void main(String[] args) {
		
		// Here we have to find out the Duplicate characters from the string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String : ");
		String str1 = sc.nextLine();
		
//		here we will check Count frequency of characters so we have to create 1 array for integer storing
		int[] count = new int[256];
		
		for(int i=0; i<=str1.length()-1; i++) 
		{
			count[str1.charAt(i)]++;
		}
		for(int i=0; i<256; i++) 
		{
			if(count[i]>1) {
				System.out.println((char)(i)+ " Count = "+count[i]);
			}
		}

	}

}
